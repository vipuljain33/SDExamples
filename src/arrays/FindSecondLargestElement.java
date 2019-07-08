package arrays;

import java.util.*;
import java.util.stream.Stream;

public class FindSecondLargestElement {

    public static void main(String[] args)
    {
        int arr[] = {12, 35, 1, 10, 34, 1, 45, 67, 67};
       int secondLargest = findSecondLargest(arr);
        System.out.println(secondLargest);

        int second = secondLargestUsingHashing(arr);

        System.out.println("Second Largest number using hashing is = "+ second);




    }

    public static int findSecondLargest(int[] arr)
    {
        int first, second;

        first = second = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {

            if(arr[i] > first)
            {
                second = first;
                first = arr[i];
            }
            else if(second > arr[i] && arr[i] != first)
            {
                second = arr[i];
            }



        }
        return second;

    }

    public static int secondLargestUsingHashing(int[] arr)
    {
        Arrays.sort(arr);
        System.out.println(arr[arr.length -1]);

        Map<Integer, Integer> map = new LinkedHashMap<>();


        for(int i = 0; i < arr.length; i++)
        {


            if(map.containsKey(arr[i]))
            {

                map.put(arr[i], map.get(arr[i])+1);

            }else
            {
                map.put(arr[i], 1 );
            }
        }

        map.forEach((k,v) -> System.out.println("Key = "+ k + " "+ "value = "+ v));

        Object[] keyArr = map.keySet().toArray();

        return (int) keyArr[keyArr.length-2];



    }
}
