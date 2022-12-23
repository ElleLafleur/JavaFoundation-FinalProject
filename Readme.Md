Year Up - Java Foundations
Final Project
Overview:
In your pre-assigned groups of 3-4, your task is to create an interactive game that a user can play
through the command-line. Your game can be single player or multiplayer (passing the laptop from
player X to player Y), but it:
1) Must take in input commands from the user through command line,
2) Perform actions in your game based on those commands
3) Pass “control” back and forth between the program and the user at least 3 times.
   One back and forth = the user enters a command, the game performs an action and passes
   control backto user to enter in another command
4) The user can choose to quit the game by typing in the command “quit”
   Ex (feel free to take on this one, but we encourage you to be creative and come up with your own):
   Hangman game - create a program whereby Player 1 can enter in the target word (maybe “YearUp”)
   then passes the computer to Player 2. Player 2 can then guess letters, with the understanding that
   5-10 wrong guesses will cause them to lose.
   At the onset, we might see blanks for each letter in the target word:
_ _ _ _ _ _
Let’s say the player guesses Y, now the following would be presented to the user:
Y _ _ _ _ _ _
Let’s say the player guesses X, now we could show the following to the user:
O
Y _ _ _ _ _ _
Now the player guesses wrongly again, with V:
O
|
Y _ _ _ _ _ _
And so on.
A losing user would see for example:
O
/ | \
/ \
Y _ a _ u _
I’m sorry, you lost!
Be creative and have fun with it!
Group guidelines:
1. Create a git project to share your code. Make use of what you learned in class:
1. Have each team member work on their own branch
2. Open PR requests to merge your code back into the main
   branch
2. Use some Agile Development methods among your team
1. Create a Kanban board to break up the project into small
   tasks
   i. You can use Trello to create a free board:
   https://trello.com/templates/engineering/kanban-dev-board-lvRpONOJ
2. Assign the tasks among the team members
3. Have daily standup meetings to touch base with your team
   and adjust your tasks as you go
   Provide your instructors with access to your git project and your Trello board in order for them to track
   your progress!