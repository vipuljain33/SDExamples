package arrays;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class FindPairsofSum {

    public static void main(String[] args)
    {
        int[] arr = {6,3,5,2,1,7};

        int sum = 4;

        findPairsofSum(arr, sum);


    }

    public static void findPairsofSum(int[] a, int sum)
    {
        //solving this problem using hashtable

        HashSet<Integer> s = new HashSet<>();
        for(int i =0; i < a.length; i++)
        {
            int temp = sum - a[i];

            if(s.contains(temp))
            {
                System.out.println("Pair with given sum = "+ sum + " is "+ a[i]+ ", "+ temp);
            }
            s.add(a[i]);




        }




    }
}
