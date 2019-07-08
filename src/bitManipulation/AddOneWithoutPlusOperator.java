package bitManipulation;

/**
 * Created by vipuljain on 12/07/18.
 */
public class AddOneWithoutPlusOperator {

    public static void main(String[] args)
    {

        Integer i = new Integer(13);
        System.out.println(Integer.toBinaryString(i));

        Integer y = ~i;
        System.out.println(y);
        System.out.println(Integer.toBinaryString(y));

    }


}
