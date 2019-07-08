package arrays;

public class RepeatedIntegers {

    public static void checkDuplicates(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[Math.abs(arr[i])]> 0)
            {
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            }else
            {
                System.out.println(Math.abs(arr[i])+ " is a repetetion");
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {2,3,4,5,2,3};

        checkDuplicates(arr);
    }
}
