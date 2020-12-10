"""

    Rock beats scissors
    Scissors beats paper
    Paper beats rock
"""
	
# Get the users names
user1 = input("What is player1's name? ")
user2 = input("What is player2's name? ")

	
# While looping endlessly	
while True:
    # Get the user choices
    user1_ans = input(user1 + ", do you want to choose rock, paper or scissors? ").lower()
    user2_ans = input(user2 + ", do you want to choose rock, paper or scissors? ").lower()

    if user1_ans == user2_ans:
        print("Its a tie!")
    elif user1_ans == 'rock':
        if user2_ans == 'scissors':
            print("rock wins")
        else:
            print("paper wins!")
    elif user1_ans == 'scissors':
        if user2_ans == 'paper':	
            print("Scissors win!")
        else:
            print("Rock wins!")
    elif user1_ans == 'paper':
        if user2_ans == 'rock':
            print("Paper wins!")
        else:
            print("Scissors win!")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")

    #check whether the player wants to play again
    repeat = input("Do you want to play another game(yes/no): ").lower()

    if(repeat == "yes"):
        pass
    elif(repeat == "no"):
        raise SystemExit       
    else:	
        print("You entered an invalid option. Exiting now.")	
        raise SystemExit


        

