package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {



    public static void main(String[] args)
    {
        List<Integer> evenNumbers, doubledList;


        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(23);
        list.add(35);
        list.add(68);
        list.add(36);
        list.add(79);
        list.add(80);
        list.add(91);

        System.out.println("Unprocessed List = "+ list);

        //Find all the even numbers present in a list

        evenNumbers = list.stream().filter(i -> i%2 == 0 ).collect(Collectors.toList());

        System.out.println("Even numbers filtered from above list");
        System.out.println(evenNumbers);



        //Double all the numbers present in a list

        doubledList = list.stream().map(i -> i*2).collect(Collectors.toList());

        System.out.println("Values of elements of list doubled");
        System.out.println(doubledList);
    }
}
