public class sorting {
    public static void sort (int[] scores)
    {
        int temp = 0;
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
            System.out.println(scores[i] + " ");
        }

    }

    public static void main (String [] args)
    {
        int myArray[] = {3, 6, 9, 2, 7, 8, 10};
        sort(myArray);
    }
}