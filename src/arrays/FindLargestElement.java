package arrays;

public class FindLargestElement {

    public static void main(String[] args)
    {
        int arr[] = {12, 35, 1, 10, 34, 1, 45, 67};
        int largest = largestElement(arr);
        System.out.println(largest);

    }

    public static int largestElement(int[] arr)
    {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
        }

        return largest;
    }
}
