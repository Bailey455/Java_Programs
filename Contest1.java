import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.File;
public class Contest1 {

   public static void transpose(int m[][])
   {
      for(int i = 0; i < m[0].length; i++)
      {
         for (int j = 0; j < m.length; j++)
         {
            System.out.print(m[j][i] + " ");
         }
         System.out.println();
      }
   }
   public static void main(String args[]) throws FileNotFoundException { 
      //begin every code for the contest with this
       Scanner in = new Scanner(new File("matrix.txt")); 
       //Scanner in = new Scanner(System.in);  //allows for a new scanner 
           
       //while (in.hasNextLine()) {      //to check the input file (not necessary)       
         // System.out.println(in.nextLine());   //comment out so it doesn't show the input
         //     }    
        // }
      //to here include for contest

         int n = Integer.parseInt(in.nextLine()); //use this versionif you know you will also be reading some strings

         for(int i = 1; i <=n; i++)
         {
            int r = in.nextInt();
            int c = in.nextInt();
            int m [][]= new int [r][c];
            for (int j = 0; j < r; j++)
            {
               for (int k = 0; k < c; k++)
               {
                  m[j][k] = in.nextInt();
               }
            }
         System.out.println("T of Matrix " + i + "; ");
         transpose(m);
         System.out.println();
         }
    }
   }

