import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class state {
    public static void main(String args[]) throws FileNotFoundException{
        Scanner sc = new Scanner(new File ("state.txt"));
        int n = sc.nextInt();
        sc.nextLine();
        double totalWater = 0;
        String mostWaterState = "";
        double waterPerState[] = new double [n];
        String cities [] = new String [n];

        for (int i = 0; i < n; i ++) {
            double totalSnow = sc.nextDouble();
            int lowTemp = sc.nextInt();
            String city = sc.nextLine();

            if (lowTemp > 30 || lowTemp <= 30)
                totalWater = totalSnow/10;
            if (lowTemp == 27)
                totalWater = totalSnow/10;
            if (lowTemp <= 25)
                totalWater = totalSnow/15;
            if (lowTemp == 21)
                totalWater = totalSnow/15;
            if (lowTemp <= 18)
                totalWater = totalSnow/20;
            if (lowTemp == 15)
                totalWater = totalSnow/20;
            if (lowTemp <= 12)
                totalWater = totalSnow/30;
            if (lowTemp == 7)
                totalWater = totalSnow/30;
            if (lowTemp <= 5)
                totalWater = totalSnow/40;
            if (lowTemp == 0)
                totalWater = totalSnow/40;
            if (lowTemp <= -10)
                totalWater = totalSnow/50;

            waterPerState[i] = totalWater;
            cities[i] = city;        
        }

        double max = 0.0;
        for(int j = 0; j < waterPerState.length; j++)
        {
            if (waterPerState[j] > max)
            {
                max = waterPerState[j];
                mostWaterState = cities[j];
            }

        }

        System.out.printf("Most water fell in %s (%.1f inches)\n", mostWaterState, max);
    }
}