package lambdas;

import java.util.ArrayList;
import java.util.List;

public class ForEachUsingLambda {

    public static void main(String[] args)
    {

        List<String> l = new ArrayList<>();

        l.add("Vipul");
        l.add(("Poorva"));
        l.add("Nitika");

        l.forEach(
                (n)->System.out.println(n)
        );


        int a = new Integer(10);

        System.out.println(a);





    }
}
