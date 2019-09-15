package arrays;

public class BinarySearch {

    public static void main(String[] args)
    {
        int[] arr = {2,4,6,66, 78, 98, 101, 201,300, 501,505};

        int reponse = binarySearch(arr, 201);
        System.out.println(reponse);

    }

    public static int binarySearch(int[] arr, int number)
    {
        int start = 0;
        int end = arr.length-1;

        while (start <= end)
        {
            int mid = (start+end)/2;

            if(arr[mid] == number)
            {
                return mid;
            }else if(number < arr[mid])
            {
                end = mid-1;

            }else {
                start = mid+1;


            }


        }

        return -1;
    }
}

