package arrays;

public class MoveZeroesToBeginning {


    public static void main(String[] args)
    {

        int[] arr = {1,3,0,5,0,6,4,20,0,1};
        int[] result = moveZeroesToBeginning(arr);

        for(int a : result)
        {
            System.out.println(a);
        }
    }

    public static int[] moveZeroesToBeginning(int[] a)
    {
        int boundary = 0, temp = 0;

        for (int i = 0; i < a.length; i++)
        {
            if(a[i] == 0)
            {
               temp = a[boundary];
               a[boundary] = a[i];
               a[i] = temp;
               boundary +=1;
            }
        }


        return a;
    }


}
