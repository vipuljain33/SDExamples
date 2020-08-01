package predefinedInterfaces.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Demo {


    public static void main(String[] args)
    {

        Predicate<Integer> p = (i) -> i>20;

        System.out.println(p.test(23));

        System.out.println(p.test(13));

        System.out.println("Predicate for String length");


        Predicate<String> p2 = (s) -> s.length() >5;

        System.out.println(p2.test("Hyderabad"));

        System.out.println("Predicate for Array list is empty or not");

        Predicate<Collection<Integer>> p3 = (c) -> c.isEmpty();

        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(23);

        System.out.println(p3.test(l1));



    }
}
