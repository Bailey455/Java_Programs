import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Contest2 {
    public static void sort (double[] scores)
    {
        double temp = 0.0;
        int n = scores.length;

        for(int i = 0; i < n -1; i++)
        {
            for(int j = 0; j < n - i -1; j++)
            {
                if (scores[j] >= scores[j +1])
                temp = scores[j];
                scores[j] = scores[j +1];
                scores[j+1] = temp;
            }
        }

    }

    public static void findHighest(double [] scores)
    {
        System.out.println("Highest grade: " + scores[scores.length-1] + "%");
    }

    public static void findMedian(double [] scores)
    {
        
        if (scores.length % 2 == 0)
        {
            System.out.println("Median score: " + ((scores[scores.length/2] + scores[(scores.length/2) + 1]) / 2)+ "%");
        }
        else 
        {
            System.out.println("Median score: " + scores[scores.length/2] + "%");
        }
    }

    public static void main (String [] args) throws FileNotFoundException {  
    Scanner in = new Scanner(new File("test.txt")); 
    double score = 0;
    double grade = 0;

    String testAnswers = in.nextLine();
    char[] testKey = new char[testAnswers.length()];
    for (int i = 0; i < testAnswers.length(); i++)
    {
        testKey[i] = testAnswers.charAt(i);
    }

    int numberTest = Integer.parseInt(in.nextLine());
    double [] scores = new double[numberTest];

    for (int j = 0; j < numberTest; j++)
    {
        String nextAnswer = in.nextLine();
        char [] next = new char [nextAnswer.length()];
        for(int k = 0; k < nextAnswer.length(); k++)
        {
            next[k] = nextAnswer.charAt(k);
            if (next[k] == testKey[k])
                score++;
        }
        grade = (score/testAnswers.length())*100; 
        scores[j] = grade;
        System.out.print(scores[j] + "\n");
        score = 0;
    }
    System.out.println("");
    sort(scores);

    for(int k = 0; k < scores.length; k++)
    {
        System.out.println(scores[k] + " ");
    }

    findMedian(scores);
    findHighest(scores);
    }
}