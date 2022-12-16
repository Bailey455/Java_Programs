import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class shift {
    public static void main (String args []) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("shift.txt"));

        int n = sc.nextInt();
        double totalTime = 0;
        double totalMinutes = 0;
        
        
        for (int i = 0; i < n; i ++) {
            double logIn = sc.nextDouble();
            double logOut = sc.nextDouble();
            
            if (logIn < logOut)
               totalTime = (logIn - logOut) * -1;
            else
                totalTime = (logOut - logIn) + 2360;

            totalMinutes = totalTime%100;
            totalTime = totalTime/100;

            if (totalMinutes > 59)
                totalMinutes -= 40;
            
            if (totalMinutes == 1)
                System.out.printf("%d hours %d minute\n", (int)totalTime, (int)totalMinutes); 
            else if ((int)totalTime == 1)
            System.out.printf("%d hour %d minutes\n", (int)totalTime, (int)totalMinutes);
            else 
            System.out.printf("%d hours %d minutes\n", (int)totalTime, (int)totalMinutes);
         }
    }
}