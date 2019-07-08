package arrays;

import java.util.ArrayList;
import java.util.List;

public class LeadersInAnArray {

    public static void main(String[] args)
    {
        int[] arr = {16,17,4,3,5,2};
        leadersInArray(arr);

    }

    /*scan all the elements from right to left and keep track of maximum till now */

    public static void leadersInArray(int[] arr)
    {
        int maxFromRight = arr[arr.length-1];
        System.out.println(maxFromRight);

        for(int i = arr.length -2; i >= 0; i--)
        {
            if(maxFromRight < arr[i])
            {
                maxFromRight = arr[i];
                System.out.println(maxFromRight);
            }
        }

    }
}
