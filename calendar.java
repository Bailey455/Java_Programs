import java.util.Scanner;

public class calendar {
    public static String monthName(int m)
    {
        int monthNum = m;
        String monthString = "";

        switch(monthNum)
        {
            case 0: monthString = "January";
            case 1: monthString = "February";
            case 2: monthString = "March";
            case 3: monthString = "April";
            case 4: monthString = "May";
            case 5: monthString = "June";
            case 6: monthString = "July";
            case 7: monthString = "August";
            case 8: monthString = "September";
            case 9: monthString = "October";
            case 10: monthString = "November";
            case 11: monthString = "December";
        }

        return monthString;
    }
    
    public static int daysInMonth(int m, int y)
    {
        int monthInt = m;
        int yearInt = y;
        int totalDays = 30;
        boolean leapYear = false;

        if ((yearInt % 4 == 0 && yearInt % 100 != 0) || yearInt % 400 == 0) leapYear = true;
        
        switch(monthInt)
        {
            case 0, 2, 4, 6, 7, 9, 11:
                totalDays = 31;
            case 1:
                if(leapYear) totalDays = 29;
                else totalDays = 28;
        }
        return totalDays;
    }
    
    public static void printMonth(int inputYear, int month, int weekday)
    {
        String nameMonth = monthName(month);
        int daysInMonth = daysInMonth(month, inputYear);
        int totalDays = 1;
        int daysInWeek = 7;
        
        System.out.printf("%s - %d\n",nameMonth, inputYear);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        while(totalDays < daysInMonth)
        {
            while (weekday < daysInWeek)
            {
                totalDays += 1;
                System.out.printf("   %d", totalDays);
                weekday += 1;
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scnr.nextInt();
        System.out.println("");

        System.out.print("Input a Day (0 - 6): ");
        int day = scnr.nextInt();
        System.out.println("");

        System.out.println("======= Calendar Program ==========");

        printMonth(year, 1, day);
        scnr.close();
    }
}
