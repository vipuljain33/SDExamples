package arrays;

public class ReversingArrayInPlace {

    public static void reverseArray(int[] arr)
    {
        int i = 0;
        int j = arr.length -1;

        while(i != j)
        {
            swap(arr, i, j);

            i++;
            j--;

        }

    }

    private static void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1] ;
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args)
    {

        int[] arr = {3,5,7,9,11,13,15};

        reverseArray(arr);

        for (int i: arr) {
            System.out.print(i + " ");
        }


    }


}
