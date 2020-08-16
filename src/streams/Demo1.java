package streams;

import poc.Interf;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        //Count of even number present in above list

        Long count = list.stream().filter(i -> i%2==0).count();

        System.out.println("Count of even numbers in list = "+ count);


        //Sorting filtered list in ascending order or default order

        List<Integer> evenNumberAscendingOrder = list.stream().filter(i -> i%2==0).sorted().collect(Collectors.toList());

        System.out.println("Sorted list of even numbers in ascending order: ");

        System.out.println(evenNumberAscendingOrder);


        //Sorting filtered list in descending order

        System.out.println("Sorted list of even numbers in descending order: ");

        List<Integer> evenNumbersDescendingOrder= list
                .stream().filter(i -> i%2==0)
                .sorted((i1, i2) -> i1>i2?-1:i1<i2?1:0)

                .collect(Collectors.toList());


        System.out.println(evenNumbersDescendingOrder);

        //Minimum number present in the filtered list. For this sorting has to be done in default order or ascending order

        System.out.println("Minimum number present in the list: ");

        int minNumber = list.stream().filter(i-> i%2==0).min((i1, i2)->i1>i2?1:i1<i2?-1:0).get();

        System.out.println(minNumber);


        //Maximum number present in the filtered list

        System.out.println("Maximum number present in the list: ");


        int maxNumber = list.stream().max((i1, i2)-> i1>i2?1:i1<i2?-1:0 ).get();


        System.out.println(maxNumber);


        //Double all the numbers present in a list

        doubledList = list.stream().map(i -> i*2).collect(Collectors.toList());

        System.out.println("Values of elements of list doubled");
        System.out.println(doubledList);

    }
}
