package arrays;

public class MoveAllZeroesToEnd {

    public static void main(String[] args)
    {

        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int[] returned= moveAllZeroesToEnd(arr);

        for(int i = 0; i < returned.length; i++)
        {
            System.out.print(returned[i]+ " ");
        }

        int[] result = moveAllZeroesToEnd2(arr);
        for(int a : result)
        {
            System.out.println(a);
        }

    }

    public static int[] moveAllZeroesToEnd(int[] arr)
    {

        int count = 0;
        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i] != 0)
            {
                arr[count] = arr[i];
                count++;
            }
        }

        while (count < arr.length)
        {
            arr[count] = 0;
            count++;
        }
        return arr;
    }

    public static int[] moveAllZeroesToEnd2(int[] a)
    {
        int boundary = a.length-1;
        int temp = 0;
        for(int i = a.length-1; i >= 0; i--)
        {
            if(a[i] == 0)
            {
                temp = a[boundary];
                a[boundary] = a[i];
                a[i] = temp;
                boundary --;
            }

        }

        return a;
    }

}
