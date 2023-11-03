<table><tr><td> <em>Assignment: </em> It114 Milestone1</td></tr>
<tr><td> <em>Student: </em> Waheeb Khan (wik3)</td></tr>
<tr><td> <em>Generated: </em> 11/2/2023 9:27:14 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F23/it114-milestone1/grade/wik3" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create a new branch called Milestone1</li><li>At the root of your repository create a folder called Project if one doesn't exist yet</li><ol><li>You will be updating this folder with new code as you do milestones</li><li>You won't be creating separate folders for milestones; milestones are just branches</li></ol><li>Create a milestone1.md file inside the Project folder</li><li>Git add/commit/push it to Github (yes it'll be blank for now)</li><li>Create a pull request from Milestone1 to main (don't complete/merge it yet, just have it in open status)</li><li>Copy in the latest Socket sample code from the most recent Socket Part example of the lessons</li><ol><li>Recommended Part 5 (clients should be having names at this point and not ids)</li><li><a href="https://github.com/MattToegel/IT114/tree/Module5/Module5">https://github.com/MattToegel/IT114/tree/Module5/Module5</a>&nbsp;<br></li></ol><li>Fix the package references at the top of each file (these are the only edits you should do at this point)</li><li>Git add/commit the baseline</li><li>Ensure the sample is working and fill in the below deliverables</li><ol><li>Note: The client commands likely are different in part 5 with the /name and /connect options instead of just connect</li></ol><li>Get the markdown content or the file and paste it into the milestone1.md file or replace the file with the downloaded version</li><li>Git add/commit/push all changes</li><li>Complete the pull request merge from step 5</li><li>Locally checkout main</li><li>git pull origin main</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Startup </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot showing your server being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fwik3%2F2023-11-03T00.07.20Milestone1Server.png.webp?alt=media&token=5a6e37a1-3f1a-405d-9eba-f222660a217b"/></td></tr>
<tr><td> <em>Caption:</em> <p>connecting to Server.java<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot showing your client being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fwik3%2F2023-11-03T00.11.022.png.webp?alt=media&token=75aef577-6d8b-4708-9763-66df1f63467b"/></td></tr>
<tr><td> <em>Caption:</em> <p>Running Client.java<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fwik3%2F2023-11-03T00.19.043connect.png.webp?alt=media&token=2d5798eb-3e91-4f50-95b4-04915b0251a6"/></td></tr>
<tr><td> <em>Caption:</em> <p>successfully connected to Server<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the connection process</td></tr>
<tr><td> <em>Response:</em> <div>The server is first compiled, and during its compilation, the server thread is<br>also compiled in conjunction with it. Once compiled, the server starts listening on<br>port 3000, ready to accept a client's connection.</div><div><br></div><div>To establish a connection, the client<br>must set a name beforehand. In the fifth part of the process, a<br>forward slash ("/") must precede the user's input, obliging them to set the<br>name using "/name" and then entering the desired name.</div><div><br></div><div>With the name properly set,<br>the client can connect using the command "/connect localhost:3000," specifying where the server<br>is awaiting the connection. This way, the client and server establish a connection<br>and communicate with each other.</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Sending/Receiving </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fwik3%2F2023-11-03T01.01.59connect1.png.webp?alt=media&token=4822fe41-8856-45dd-a71b-4b4988fe415a"/></td></tr>
<tr><td> <em>Caption:</em> <p>2 clients connected to server<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fwik3%2F2023-11-03T01.02.51connect2.png.webp?alt=media&token=98b43887-6cf4-4dcc-9677-f777c43d13ed"/></td></tr>
<tr><td> <em>Caption:</em> <p>clients sending messaged to each other in same room<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fwik3%2F2023-11-03T01.03.50connect3.png.webp?alt=media&token=699b5529-fd26-483e-a5d5-6b7a12b5e6d9"/></td></tr>
<tr><td> <em>Caption:</em> <p>2 clients in different rooms cant send each other messages<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the messages are sent, broadcasted (sent to all connected clients), and received</td></tr>
<tr><td> <em>Response:</em> <div>From the client's perspective, their input is initially read and then passed through<br>the process command function, which subsequently sends the relevant information.</div><div><br></div><div>Within the server thread,<br>the process message function operates with three distinct cases: connect, disconnect, and message.<br>It efficiently processes data from the client and then navigates through these different<br>scenarios.</div><div><br></div><div>In the room class, the process command function is responsible for handling input<br>from both clients and the server thread. It employs a case structure to<br>manage tasks such as room creation, joining rooms, and disconnection from rooms. The<br>resulting message is then relayed back to the client.</div><div><br></div><div>Clients receive the same message<br>if they are located within the same room, but messages are not shared<br>among clients in separate rooms.</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Disconnecting / Terminating </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fwik3%2F2023-11-03T01.20.03disconnectfromserver.png.webp?alt=media&token=30414646-b33a-4fa8-b515-8c8b40eb56ac"/></td></tr>
<tr><td> <em>Caption:</em> <p>Client Disconnecting from server<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fwik3%2F2023-11-03T01.23.35terminateServer.png.webp?alt=media&token=74d26f06-67a4-46b6-8fea-fc0dd1689e6a"/></td></tr>
<tr><td> <em>Caption:</em> <p>terminated server<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the various disconnects/terminations are handled</td></tr>
<tr><td> <em>Response:</em> <div>When the Boolean status "Running" is false, it signifies that a client's connection<br>to a socket is terminated, indicating the absence of an active server thread<br>for that client. The client program is designed with a try-catch block to<br>handle potential exceptions stemming from the server's disconnection. This approach prevents the client<br>program from crashing and enables it to continue running. Instead, it informs the<br>client that the server has been disconnected or terminated.</div><div><br></div><div>Similarly, the server employs a<br>similar logic to determine if a client is connected or not and implements<br>exception handling to ensure that these exceptions do not disrupt the overall operation<br>of the code.</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707834-bf5a5b13-ec36-4597-9741-aa830c195be2.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add the pull request for this branch</td></tr>
<tr><td>Not provided</td></tr>
<tr><td> <em>Sub-Task 2: </em> Talk about any issues or learnings during this assignment</td></tr>
<tr><td> <em>Response:</em> <p>just issues with folder structure.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F23/it114-milestone1/grade/wik3" target="_blank">Grading</a></td></tr></table>