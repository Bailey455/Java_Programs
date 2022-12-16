import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class healthApp {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner in = new Scanner(new File("healthApp.txt"));

        double num = in.nextDouble();

        double miles = 0;
        double days = 0;

        double milesInMonth = 0;
        double daysInMonth = 0;
        
        double milesInYear = 0;
        double daysInYear = 0;
        int weekCounter = 0; 
        int monthCounter = 0;

        while(num != -3.0) {
            if(num == -1.0) {
                weekCounter++;
                System.out.printf("Week #%d = %.2f mi.\n", weekCounter, miles/days);
                in.nextLine();
                days = 0;
                miles = 0;
            }

            if(num == -2.0) {
                monthCounter++;
                System.out.printf("\nMonth #%d = %.2f\n\n", monthCounter, milesInMonth/daysInMonth);
                daysInMonth = 0;
                milesInMonth = 0;
            }

            if(num > 0.0) {
                miles += num;
                days++;
                milesInMonth += num;
                daysInMonth++;
                milesInYear += num;
                daysInYear++;
            }

            //System.out.println(num);
            num = in.nextDouble();
        }

        System.out.printf("Year to date for %d days = %.2f mi.\n", (int)daysInYear, milesInYear/daysInYear );
}
}


