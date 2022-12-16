import java.util.Scanner;

public class powerFunction {
    public static void main(String[] args)
    {
        System.out.println(" ");
        Scanner scnr = new Scanner (System.in);
        System.out.print("Please input a number for base: ");
        int base = scnr.nextInt();

        while (base < 0)
        {
            System.out.print("Please input a POSITIVE number for a base: ");
            base = scnr.nextInt();
        }


        System.out.print("Please input a number for the exponent: ");
        int exponent = scnr.nextInt();

        System.out.printf("%d to the %d power is %d\n", base, exponent, power(base,exponent));
        scnr.close(); 
    }


    private static int power (int base, int exp)
    {
        int total = 1;

        if (base == 0)
        {
            total = 1;
        }
        else
        {
            for (int i = 0; i < exp; i++)
            {
                 total *= base;
            }
        }   

        return total;
    }
}