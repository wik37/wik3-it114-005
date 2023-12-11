<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone 2</td></tr>
<tr><td> <em>Student: </em> Waheeb Khan (wik3)</td></tr>
<tr><td> <em>Generated: </em> 12/11/2023 12:44:42 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F23/it114-chatroom-milestone-2/grade/wik3" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone2 from the proposal document:&nbsp; <a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Payload </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Payload Screenshots</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fwik3%2F2023-12-11T16.04.07payloadtypes1.png.webp?alt=media&token=7b7d7b9d-c410-4486-ab69-9421aa65173c"/></td></tr>
<tr><td> <em>Caption:</em> <p>i was working through milestones 2/3 which is why there are more payload<br>types.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fwik3%2F2023-12-11T16.04.22payloadtypes2.png.webp?alt=media&token=6d7a90ed-5f25-4bf6-9e62-97969a2846e6"/></td></tr>
<tr><td> <em>Caption:</em> <p>extended<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Server-side commands </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the mentioned commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fwik3%2F2023-12-11T04.44.07Roll.flip.png.webp?alt=media&token=2ed0d1cf-9e50-45b9-9031-ed58127d8836"/></td></tr>
<tr><td> <em>Caption:</em> <p>code for the roll/flip commands<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Explain the logic/implementation of each commands</td></tr>
<tr><td> <em>Response:</em> <div><br></div><div><p style="border: 0px solid rgb(217, 217, 227); box-sizing: border-box; --tw-border-spacing-x: 0; --tw-border-spacing-y: 0;<br>--tw-translate-x: 0; --tw-translate-y: 0; --tw-rotate: 0; --tw-skew-x: 0; --tw-skew-y: 0; --tw-scale-x: 1; --tw-scale-y:<br>1; --tw-pan-x: ; --tw-pan-y: ; --tw-pinch-zoom: ; --tw-scroll-snap-strictness: proximity; --tw-gradient-from-position: ; --tw-gradient-via-position: ;<br>--tw-gradient-to-position: ; --tw-ordinal: ; --tw-slashed-zero: ; --tw-numeric-figure: ; --tw-numeric-spacing: ; --tw-numeric-fraction: ; --tw-ring-inset:<br>; --tw-ring-offset-width: 0px; --tw-ring-offset-color: #fff; --tw-ring-color: rgba(69,89,164,.5); --tw-ring-offset-shadow: 0 0 transparent; --tw-ring-shadow: 0<br>0 transparent; --tw-shadow: 0 0 transparent; --tw-shadow-colored: 0 0 transparent; --tw-blur: ; --tw-brightness:<br>; --tw-contrast: ; --tw-grayscale: ; --tw-hue-rotate: ; --tw-invert: ; --tw-saturate: ; --tw-sepia: ;<br>--tw-drop-shadow: ; --tw-backdrop-blur: ; --tw-backdrop-brightness: ; --tw-backdrop-contrast: ; --tw-backdrop-grayscale: ; --tw-backdrop-hue-rotate: ; --tw-backdrop-invert:<br>; --tw-backdrop-opacity: ; --tw-backdrop-saturate: ; --tw-backdrop-sepia: ; margin-bottom: 1.25em; color: rgb(55, 65, 81);<br>font-family: Söhne, ui-sans-serif, system-ui, -apple-system, &quot;Segoe UI&quot;, Roboto, Ubuntu, Cantarell, &quot;Noto Sans&quot;, sans-serif,<br>&quot;Helvetica Neue&quot;, Arial, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;, &quot;Noto<br>Color Emoji&quot;; font-size: 16px; white-space-collapse: preserve;">Roll: The function 'result' generates a random number<br>between 0 (inclusive) and the specified 'x' value (exclusive). This resulting number is<br>then sent to the client. The 'gettingClientName()' function is employed to obtain the<br>client's name by iterating through the server threads. Subsequently, the obtained client name<br>is added to the result and broadcasted to the clients.</p><p style="border: 0px solid<br>rgb(217, 217, 227); box-sizing: border-box; --tw-border-spacing-x: 0; --tw-border-spacing-y: 0; --tw-translate-x: 0; --tw-translate-y: 0;<br>--tw-rotate: 0; --tw-skew-x: 0; --tw-skew-y: 0; --tw-scale-x: 1; --tw-scale-y: 1; --tw-pan-x: ; --tw-pan-y:<br>; --tw-pinch-zoom: ; --tw-scroll-snap-strictness: proximity; --tw-gradient-from-position: ; --tw-gradient-via-position: ; --tw-gradient-to-position: ; --tw-ordinal: ;<br>--tw-slashed-zero: ; --tw-numeric-figure: ; --tw-numeric-spacing: ; --tw-numeric-fraction: ; --tw-ring-inset: ; --tw-ring-offset-width: 0px; --tw-ring-offset-color:<br>#fff; --tw-ring-color: rgba(69,89,164,.5); --tw-ring-offset-shadow: 0 0 transparent; --tw-ring-shadow: 0 0 transparent; --tw-shadow: 0<br>0 transparent; --tw-shadow-colored: 0 0 transparent; --tw-blur: ; --tw-brightness: ; --tw-contrast: ; --tw-grayscale:<br>; --tw-hue-rotate: ; --tw-invert: ; --tw-saturate: ; --tw-sepia: ; --tw-drop-shadow: ; --tw-backdrop-blur: ;<br>--tw-backdrop-brightness: ; --tw-backdrop-contrast: ; --tw-backdrop-grayscale: ; --tw-backdrop-hue-rotate: ; --tw-backdrop-invert: ; --tw-backdrop-opacity: ; --tw-backdrop-saturate:<br>; --tw-backdrop-sepia: ; margin-top: 1.25em; margin-bottom: 0px; color: rgb(55, 65, 81); font-family: Söhne,<br>ui-sans-serif, system-ui, -apple-system, &quot;Segoe UI&quot;, Roboto, Ubuntu, Cantarell, &quot;Noto Sans&quot;, sans-serif, &quot;Helvetica Neue&quot;,<br>Arial, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;, &quot;Noto Color Emoji&quot;;<br>font-size: 16px; white-space-collapse: preserve;">Flip: The 'resultFlip' is determined by generating a random number<br>between 0 (inclusive) and 2 (exclusive) using 'random.nextInt(2)'. If 'resultFlip' equals 0, the<br>outcome is recorded as heads; otherwise, it is recorded as tails. The client's<br>name is retrieved using a specific function, and the result, along with the<br>client's name, is broadcasted to the clients.</p></div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Text Display </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the various style handling via markdown or special characters</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fwik3%2F2023-12-11T16.13.29caseDisplay.png.webp?alt=media&token=8ad9f7e6-f6c8-4abb-8649-9e94568c1d45"/></td></tr>
<tr><td> <em>Caption:</em> <p>case Display<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fwik3%2F2023-12-11T16.14.40function%20to%20process%20pt1.png.webp?alt=media&token=c02dce12-e2da-4396-8cfe-13fd4a843186"/></td></tr>
<tr><td> <em>Caption:</em> <p>process textDisplay pt1<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fwik3%2F2023-12-11T16.14.59processTextDisplay%20pt2.png.webp?alt=media&token=9d8f427f-a415-4160-943b-8c4199e4f0bc"/></td></tr>
<tr><td> <em>Caption:</em> <p>process textDislay pt2<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show source message and the result output in the terminal (note, you won't actually see the styles until Milestone3)</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fwik3%2F2023-12-11T16.16.38bold.png.webp?alt=media&token=d0b3b3f6-1aaf-4c99-81d2-d622cfb35daf"/></td></tr>
<tr><td> <em>Caption:</em> <p>forgot to fill out milestone2 md so went to milestone 3 which is<br>why it looks like this.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fwik3%2F2023-12-11T17.28.51color.png.webp?alt=media&token=e6fd5b28-d706-4c3c-bab1-8057ef1b0b39"/></td></tr>
<tr><td> <em>Caption:</em> <p>color<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Explain how you got each style applied</td></tr>
<tr><td> <em>Response:</em> <div><br></div><div>I implemented conditional statements to examine whether the text includes specific triggers, such<br>as ** for bold, * for italics, and _ for underline. Additionally, I<br>included triggers for color changes, namely ##, #, and $. In the 'display'<br>case, the function was invoked, followed by retrieving the clientName. Subsequently, the server<br>transmitted a message, broadcasting the user's action.</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Include the pull request for Milestone2 to main</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/wik37/wik3-it114-005/pull/2">https://github.com/wik37/wik3-it114-005/pull/2</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F23/it114-chatroom-milestone-2/grade/wik3" target="_blank">Grading</a></td></tr></table>