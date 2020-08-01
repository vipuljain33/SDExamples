package predefinedInterfaces.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Demo3 {

    public static void checkNameStartsWithK(Predicate<String> p, String[] arr)
    {
        for(String s : arr)
        {
            if(p.test(s))
            {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args)
    {

        String[] names = {"Amit", "Ajay", "Kartik", "Kavin", "Vipul", "Nitin"};

        Predicate<String> p = (s) -> s.charAt(0) == 'K';

        checkNameStartsWithK(p, names);




    }
}
