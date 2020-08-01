package predefinedInterfaces.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo4 {

    public static List<String> checkValidNames(Predicate p, String[] arr)
    {
        List<String> revised = new ArrayList<>();
        for(String name: arr)
        {
            if(p.test(name))
            {
                revised.add(name);
            }
        }

        return revised;
    }

    public static void main(String[] args)
    {
        //Remove null values, blank names from the names list

        String[] names = {"Tom", "Ajay", null, "Mark", " ", "Stuart", ""};

        Predicate<String> p = (s) -> !(s == null||s== " "|s=="" );


        System.out.println(checkValidNames(p, names));



    }
}
