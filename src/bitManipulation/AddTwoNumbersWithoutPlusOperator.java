package bitManipulation;

/**
 * Created by vipuljain on 13/07/18.
 */
public class AddTwoNumbersWithoutPlusOperator {

    static void add(int a, int b)
    {
        while (b != 0)
        {
            //find out common bits in 2 numbers
            int carry = a & b;
            System.out.println(carry);
            //Find sum of 2 numbers
            a = a ^ b;
            System.out.println(a);
            b = carry << 1;


        }
        System.out.println(a);
    }

    public static int addRecursive(int a, int b){

        if(b == 0)
            return a;
        return addRecursive(a^b, (a&b)<<1);
    }

    public static void main(String[] args)
    {

        //add(17,21);
        int result = addRecursive(17,21);
        System.out.println(result);
    }
}
