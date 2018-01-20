package examples.heaps;

/**
 * Created by vipuljain on 20/01/18.
 */
public class HeapSort {


    public void heapSort(int[] arr)
    {
        int n = arr.length;
        for (int i = n/2 -1; i >= 0; i--)
            heapify(arr, n, i);

        for(int i = n-1; i >=0; i--)
        {
            int temp =arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
        printArray(arr);
    }


    //Building max heap

    public int[] heapify(int[] arr, int n, int i) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest = i;      //assuming given node i is the largest node

        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        if (largest != i)
        {
            // swap largest and i
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }


        return arr;


    }

    public void printArray(int[] arr)
    {
        for(int i= 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ",");
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {23, 67, 56, 12, 90, 42, 86, 49, 345, 78, 235};

        int n = arr.length;



        HeapSort heapSort = new HeapSort();
        //int[] heapifiedArr = heapSort.heapify(arr, n, 0);




        heapSort.heapSort(arr);

        //heapSort.printArray(heapifiedArr);







    }



}
