package inheritance;

import java.util.Scanner;

/**
 * Created by vipuljain on 07/01/19.
 */
public class Demo {

    public static void main(String[] args)
    {
        //Child c = new Child("Creating object of child class");

        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        System.out.println(T);
        int[] arr = new int[T];
        for(int i = 0; i < T; i++)
        {
            arr[i] =s.nextInt();

        }
        for(int i: arr)
        {
            System.out.println(i);
        }

    }

}
