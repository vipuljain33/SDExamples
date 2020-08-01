package predefinedInterfaces.predicate;

import java.util.function.Predicate;

public class Demo2 {

    public static void check(Predicate<Integer> p, int i )
    {
        System.out.println(p.test(i));
    }


    public static void main(String[] args)
    {

        Predicate<Integer> p1 = (i) -> i > 10;

        Predicate<Integer> p2 = (i) -> i%2 == 0;


        //System.out.println(p1.and(p2).test(24));


        //When we combine two predicates, a single predicate is returned
        check(p1.and(p2), 25);

        check(p1.and(p2), 26);


    }
}
