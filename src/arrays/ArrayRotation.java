package arrays;

//Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.


public class ArrayRotation {

    public static void main(String[] args)
    {

        int[] arr = {1,2,3,4,5,6,7};
        int d = 2;
        int n = arr.length;
        leftRotate(arr,d,n);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }




    }


    static void leftRotateByOne(int[] arr, int n)
    {
        int i, temp;
        temp = arr[0];
        for(i = 0; i < n-1; i++)
        {
            arr[i] = arr[i+1];
        }
        arr[i] = temp;

    }

    static void leftRotate(int[] arr, int d, int n)
    {
        for(int i = 0; i < d; i++)
        {
            leftRotateByOne(arr, n);
        }
    }




}


