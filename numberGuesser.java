import java.util.Scanner;

public class numberGuesser{
    public static void main (String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to the number guessing game!!");
        System.out.print("Please input a number between 1 and 100: ");
        int input = scnr.nextInt();
        
        int compNum = (int) (Math.random() * 100);
        
       while (input != compNum)
       {
           if (input < compNum)
           {
               System.out.print("Try inputting a higher number: ");
               input = scnr.nextInt();
           }
           if (input > compNum)
           {
               System.out.print("Try inputting a lower number: ");
               input = scnr.nextInt();
           }
       }
       
       if (input == compNum)
            System.out.println("Good job! you guessed the number!");

        scnr.close();

    }
}


