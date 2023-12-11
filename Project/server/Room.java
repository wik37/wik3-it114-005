package Project.server;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import Project.common.Constants;

public class Room implements AutoCloseable {
	private String name;
	private List<ServerThread> clients = Collections.synchronizedList(new ArrayList<ServerThread>());
	private boolean isRunning = false;
	// Commands
	private final static String COMMAND_TRIGGER = "/";
	private final static String CREATE_ROOM = "createroom";
	private final static String JOIN_ROOM = "joinroom";
	private final static String DISCONNECT = "disconnect";
	private final static String LOGOUT = "logout";
	private final static String LOGOFF = "logoff";
	private final static String ROLL = "roll"; //person can input roll command
	private final static String FLIP = "flip"; //person can input flip command
	private final static String DISPLAY = "display"; //person can input display command
	private final static String PRIVATE = "@"; //person can input private command
	private final static String MUTE = "mute"; //person can input mute command
	private final static String UNMUTE = "unmute"; //person can input unmute command

	private static Logger logger = Logger.getLogger(Room.class.getName());

	public Room(String name) {
		this.name = name;
		isRunning = true;
	}

	private void info(String message) {
		logger.log(Level.INFO, String.format("Room[%s]: %s", name, message));
	}

	public String getName() {
		return name;
	}

	public boolean isRunning() {
		return isRunning;
	}

	protected synchronized void addClient(ServerThread client) {
		if (!isRunning) {
			return;
		}
		client.setCurrentRoom(this);
		if (clients.indexOf(client) > -1) {
			info("Attempting to add a client that already exists");
		} else {
			clients.add(client);
			sendConnectionStatus(client, true);
			sendRoomJoined(client);
			sendUserListToClient(client);
		}
	}

	protected synchronized void removeClient(ServerThread client) {
		if (!isRunning) {
			return;
		}
		clients.remove(client);
		// we don't need to broadcast it to the server
		// only to our own Room
		if (clients.size() > 0) {
			// sendMessage(client, "left the room");
			sendConnectionStatus(client, false);
		}
		checkClients();
	}

	/***
	 * Checks the number of clients.
	 * If zero, begins the cleanup process to dispose of the room
	 */
	private void checkClients() {
		// Cleanup if room is empty and not lobby
		if (!name.equalsIgnoreCase("lobby") && clients.size() == 0) {
			close();
		}
	}

	/***
	 * Helper function to process messages to trigger different functionality.
	 * 
	 * @param message The original message being sent
	 * @param client  The sender of the message (since they'll be the ones
	 *                triggering the actions)
	 */
	private boolean processCommands(String message, ServerThread client) {
		boolean wasCommand = false;
		try {
			if (message.startsWith(COMMAND_TRIGGER)) {
				String[] comm = message.split(COMMAND_TRIGGER);
				String part1 = comm[1];
				String[] comm2 = part1.split(" ");
				String command = comm2[0];
				String roomName;
				Random random = new Random(); //random number generator
				wasCommand = true;
				switch (command) {
					case CREATE_ROOM:
						roomName = comm2[1];
						Room.createRoom(roomName, client);
						break;
					case JOIN_ROOM:
						roomName = comm2[1];
						Room.joinRoom(roomName, client);
						break;
					case ROLL: //wik3 12/10/23 roll command  
						// Random random = new Random();
						int x = 3;
						int result = random.nextInt(x);
						String  resultString = Integer.toString(result);
						resultString = "<u>" + resultString + "</u>"; //nderlines the result
						
						String rollMessage = gettingClientName(client) + " chose a roll and the result of the roll is: " + resultString;
						
						sendMessage(null, rollMessage); //send message to all clients
						break;

					case FLIP: //flip command
						// Random random = new Random();
						int resultFlip = random.nextInt(2);
						String messageFlip = "";
						if (resultFlip == 0) {
							String editedResult = "<u> heads </u>"; //underlines the result
						messageFlip = gettingClientName(client) + " chose a coin flip and the result of the coin flip is: " + editedResult;
						} else {
							String editedResult = "<u> tails </u>"; //underlines the result
						messageFlip = gettingClientName(client) + " chose a coin flip and the result of the coin flip is :" + editedResult;
						}
						sendMessage(null, messageFlip); //send message to all clients
						break;
					
					case DISPLAY: //display command, changes font and color of text
						String first_text = processTextDisplayChange(comm2[1]);
						String second_text = gettingClientName(client) + " chose to change the display of the text and got " + first_text;
						sendMessage(null, second_text);
						break;

					case UNMUTE: //unmute command, unmutes a specific client
							comm2[1] = comm2[1].toLowerCase();
                        	client.unmuteClient(comm2[1]);
							
						break; 
					case MUTE: //mute command, mutes a specific client
							comm2[1] = comm2[1].toLowerCase();
                        	client.muteClient(comm2[1]);
						break;
							
					case DISCONNECT:
					case LOGOUT:
					case LOGOFF:
						Room.disconnectClient(client, this);
						break;
					/* 
					case PRIVATE:
						comm2[1] = comm2[1].toLowerCase();
						processPrivateMessage(comm2[1]);
						break;
					*/
					
					default:
						wasCommand = false;
						break;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return wasCommand;
	}

	// Command helper methods

	protected static void getRooms(String query, ServerThread client) {
		String[] rooms = Server.INSTANCE.getRooms(query).toArray(new String[0]);
		client.sendRoomsList(rooms,(rooms!=null&&rooms.length==0)?"No rooms found containing your query string":null);
	}

	protected static void createRoom(String roomName, ServerThread client) {
		if (Server.INSTANCE.createNewRoom(roomName)) {
			Room.joinRoom(roomName, client);
		} else {
			client.sendMessage(Constants.DEFAULT_CLIENT_ID, String.format("Room %s already exists", roomName));
			client.sendRoomsList(null, String.format("Room %s already exists", roomName));
		}
	}

	protected static void joinRoom(String roomName, ServerThread client) {
		if (!Server.INSTANCE.joinRoom(roomName, client)) {
			client.sendMessage(Constants.DEFAULT_CLIENT_ID, String.format("Room %s doesn't exist", roomName));
			client.sendRoomsList(null, String.format("Room %s doesn't exist", roomName));
		}
	}

	protected static void disconnectClient(ServerThread client, Room room) {
		client.setCurrentRoom(null);
		client.disconnect();
		room.removeClient(client);
	}
	// end command helper methods

	/***
	 * Takes a sender and a message and broadcasts the message to all clients in
	 * this room. Client is mostly passed for command purposes but we can also use
	 * it to extract other client info.
	 * 
	 * @param sender  The client sending the message
	 * @param message The message to broadcast inside the room
	 */
	protected synchronized void sendMessage(ServerThread sender, String message) {
		if (!isRunning) {
			return;
		}
		info("Sending message to " + clients.size() + " clients");
		if (sender != null && processCommands(message, sender)) {
			// it was a command, don't broadcast\
			return;
		}
		long from = (sender == null) ? Constants.DEFAULT_CLIENT_ID : sender.getClientId();
		synchronized (clients) {
			Iterator<ServerThread> iter = clients.iterator();
			while (iter.hasNext()) {
				ServerThread client = iter.next();
				
				//checks if sender is in muted list
				if (sender!= null && client.checkingMutedList(sender.getClientName())) {
					continue;
				}
				
				boolean messageSent = client.sendMessage(from, message);
				// PrivateList.removeAll(PrivateList); // clears the private list after every message
				if (!messageSent) {
					handleDisconnect(iter, client);
				}
			}
		}
	}
	public String gettingClientName(ServerThread sender) { // function loops over all clients/server threads and returns the name of the client that sent the message
		if (!isRunning) {
			return null;
		}
		//Trying to get CLient name
		Iterator<ServerThread> iter2 = clients.iterator();
		while (iter2.hasNext()) {
			ServerThread client = iter2.next();
		}
		return sender.getClientName();
		}
    

	public String processTextDisplayChange(String message) { //wik3 12/10/23
			String text = message;
			if (text.contains("**")) { //bolds text = **Bold**
			text = text.replace("**", "<b>");
			text = text.replace("**", "</b>");
			}
			if (text.contains("*")) { //italics text = *Italics*
			text = text.replace("*", "<i>");
			text = text.replace("*", "</i>");
			}
			if (text.contains("_")) { //underlines text = _Underline_
			text = text.replace("_", "<u>");
			text = text.replace("_", "</u>");
			}
			if (text.contains("#r")) { //changes text color to red = #r Red r#
			text = text.replace("#r", "<font color=\"#FF0000\">");
			text = text.replace("r#", "</font>");
			}
			if (text.contains("#g")) { //changes text color to green = #g Green g#
			text = text.replace("#g", "<font color=\"#00FF00\">");
			text = text.replace("g#", "</font>");
			}
			if (text.contains("#b")) { //changes text color to blue = #b Blue b#
			text = text.replace("#b", "<font color=\"#0000FF\">");
			text = text.replace("b#", "</font>");
			}
			return (text);
			}
			/* 
			Colors:
			Red: #FF0000
			Green: #00FF00
			Blue: #0000FF
			Yellow: #FFFF00
			*/


	protected synchronized void sendUserListToClient(ServerThread receiver) {
		logger.log(Level.INFO, String.format("Room[%s] Syncing client list of %s to %s", getName(), clients.size(),
				receiver.getClientName()));
		synchronized (clients) {
			Iterator<ServerThread> iter = clients.iterator();
			while (iter.hasNext()) {
				ServerThread clientInRoom = iter.next();
				if (clientInRoom.getClientId() != receiver.getClientId()) {
					boolean messageSent = receiver.sendExistingClient(clientInRoom.getClientId(),
							clientInRoom.getClientName());
					// receiver somehow disconnected mid iteration
					if (!messageSent) {
						handleDisconnect(null, receiver);
						break;
					}
				}
			}
		}
	}

	protected synchronized void sendRoomJoined(ServerThread receiver) {
		boolean messageSent = receiver.sendRoomName(getName());
		if (!messageSent) {
			handleDisconnect(null, receiver);
		}
	}

	protected synchronized void sendConnectionStatus(ServerThread sender, boolean isConnected) {
		// converted to a backwards loop to help avoid concurrent list modification
		// due to the recursive sendConnectionStatus()
		// this should only be needed in this particular method due to the recusion
		if (clients == null) {
			return;
		}
		synchronized (clients) {
			for (int i = clients.size() - 1; i >= 0; i--) {
				ServerThread client = clients.get(i);
				boolean messageSent = client.sendConnectionStatus(sender.getClientId(), sender.getClientName(),
						isConnected);
				if (!messageSent) {
					clients.remove(i);
					info("Removed client " + client.getClientName());
					checkClients();
					sendConnectionStatus(client, false);
				}
			}
		}
	}

	private synchronized void handleDisconnect(Iterator<ServerThread> iter, ServerThread client) {
		if (iter != null) {
			iter.remove();
		}
		info("Removed client " + client.getClientName());
		checkClients();
		sendConnectionStatus(client, false);
		// sendMessage(null, client.getClientName() + " disconnected");
	}

	public void close() {
		Server.INSTANCE.removeRoom(this);
		isRunning = false;
		clients = null;
	}
}