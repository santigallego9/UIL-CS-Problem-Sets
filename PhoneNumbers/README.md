Roger is sponsoring an elite programming contest at his school. In order to ensure the quality of the contestants, he has decided to require a qualifying score to enter. You are to write a program that will determine which teams have qualified to enter his contest.
He has decided that to qualify for his contest, the programming team must have previously competed at another recognized contest. Since scores at different contests are not uniform, he has decided that some contests should require a higher minimum score than others. He has decided on the following:
You are to write a program that will print the names of the teams qualified to enter his contest.

Input
The first line of input will contain a single integer n that indicates the number of teams wanting to enter his contest. Each of the next n lines will contain a team name with no spaces followed by a space, the team score from a recognized contest, a space, and the three letter abbreviation of the recognized contest.

Output
In the order they appear in the original list, you will print the names of the teams qualified for the elite programming contest.

Example Input File

8
PASCAL_HS 455 WTC  
TURING_HS 365 CTC 
WIRTH_HS 570 STC 
WASHINGTON_HS 500 LVC 
ADAMS_HS 325 WTC 
ROBINSON_HS 480 NTC 
GATES_HS 400 CTC 
JOBS_HS 450 LVC

Example Output to Screen
PASCAL_HS 
WIRTH_HS 
WASHINGTON_HS 
ROBINSON_HS 
GATES_HS 
