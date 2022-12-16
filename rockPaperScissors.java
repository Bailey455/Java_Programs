import java.util.Scanner;
public class rockPaperScissors {
    public static void main(String[] args) {
        int playerWins = 0; 
        int compWins = 0;
        Scanner scnr = new Scanner (System.in);
        
        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.print("How many rounds would you like to play?: ");
        int rounds = scnr.nextInt();


        for (int i = 0; i < rounds; i ++)
        {
            System.out.print ("Input number 1-3 for your choice (1 = rock, 2= paper, 3 = scissors): ");
        
            int input = scnr.nextInt();

            if (input > 3)
            {
                System.out.print("Good Try! There is only three options. Try again: ");
                input = scnr.nextInt();
            }
            
            int computer = (int) (1+ (Math.random() *3));
            System.out.println("The computer chose: " + computer);
            
            
            switch (input)
            {
                case 1:
                    switch(computer)
                    {
                        case 1:
                            System.out.println("It's a tie! You chose the same thing\n");
                            break;
                        case 2:
                            System.out.println("You lost... Paper beats rock\n");
                            compWins+= 1;
                            break;
                        case 3:
                            System.out.println("You won! Rock beats scissors\n");
                            playerWins += 1;
                            break;
                    }
                    break;
                 
                case 2:
                    switch (computer)
                    {
                        case 1:
                            System.out.println("You won! Paper beats rock\n");
                            playerWins += 1;
                            break;
                        case 2: 
                            System.out.println("It's a tie! You chose the same thing\n");
                            break;
                        case 3:
                            System.out.println("You lost... Scissors beat paper\n");
                            compWins += 1;
                            break;
                    }
                    break;
                    
                case 3:
                    switch (computer)
                    {
                        case 1: 
                            System.out.println("You lost... Rock beats scissors\n");
                            compWins += 1;
                            break;
                        case 2:
                            System.out.println("You won! Scissors beats paper\n");
                            playerWins += 1;
                            break;
                        case 3: 
                            System.out.println("It's a tie! You chose the same thing\n");
                            break;
                    }
            }
        }

        if(playerWins > compWins)
        {
            if (rounds == 1)
            {
                System.out.printf("Good job! You won the one round game with %d win!", playerWins);
            }
            else
            {
                System.out.printf("Good job! You won the %d rounds game with %d wins!", rounds, playerWins);
            }
        }
        else if (playerWins == compWins)
        {
            System.out.printf("Its a tie! Both you and the computer had %d", playerWins);
        }
        else 
        {
            if (rounds == 1)
            {
                System.out.printf("Too bad the computer won with 1 win");
            }
            else 
            {
                System.out.printf("Too bad the computer won with %d wins", compWins);
            }
        }
        scnr.close();
    }
}