public class arraySorter {
    public static void main (String[]args)
    {
        int [] arr = {12, 43, 54, 2, 6, 76, 97, 23, 67, 74};

        sortArray(arr);

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortArray(int [] arr)
    {
        int temp = 0;
        for(int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - 1; j++)
            {
                if (arr[i] < arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
    }
}