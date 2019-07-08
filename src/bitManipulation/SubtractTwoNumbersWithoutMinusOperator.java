package bitManipulation;

import java.util.IntSummaryStatistics;

/**
 * Created by vipuljain on 13/07/18.
 */
public class SubtractTwoNumbersWithoutMinusOperator {

    public static void subtract(int a, int b){

        while (b != 0)
        {
            System.out.println(Integer.toBinaryString(~a));
            System.out.println(Integer.toBinaryString(a));
            System.out.println(Integer.toBinaryString(b));
            int borrow = (~a) & b;
            System.out.println(borrow);
            System.out.println(Integer.toBinaryString(borrow));
            a = a ^ b;
            System.out.println(a);
            b = borrow << 1;

        }
        System.out.println(a);
    }

    public static void main(String[] args)
    {
        subtract(50, 17);
    }
}
