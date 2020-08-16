package java8InActionExamples.chapter1;

import trees.com.vipul.bst.App;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Demo {

    static  int exportSize = 50;

    public static void main(String[] args)
    {


        List<Apple>  apples = new ArrayList<>();

        apples.add(new Apple("Red", 150));
        apples.add(new Apple("Green", 200));
        apples.add(new Apple("Pink", 110));
        apples.add(new Apple("Green", 90));
        apples.add(new Apple("Red", 120));
        apples.add(new Apple("Red", 140));


        //Java 7 way of filtering

        System.out.println("Green Apples Count = "+filterAsPerColor(apples, "Green").size());

        System.out.println("Apples weighing equal to or more than 120g = "+filterAsPerWeight(apples, 120).size());


        //Java 8 way of filtering

        System.out.println("Pink Apples count = "+filter(apples, apple -> apple.color.equals("Pink")).size());

        System.out.println("Apples weighing less than 100g = "+filter(apples, apple -> apple.weightInGrams < 100 ).size());


        System.out.println(isEligibleForExport(apples));












    }

    /*
    In order to create more customized filters, more methods needs to be written
    where there is only a single line of change in the if condition.
    It leads to code verbosity.

    We will see how functional programming and lambda expressions can help us write
    a more maintainable and concise code


    */

    public static List<Apple> filterAsPerColor(List<Apple> list, String color)
    {
        List<Apple> result = new ArrayList<>();

        for(Apple a : list)
        {
            if(a.color.equals(color))
            {
                result.add(a);

            }
        }

        return result;
    }


    public static List<Apple> filterAsPerWeight(List<Apple> list, double weight)
    {
        List<Apple> result = new ArrayList<>();

        for(Apple a : list)
        {
            if(a.weightInGrams >=120)
            {
                result.add(a);

            }
        }

        return result;
    }

    /*In this method we are accepting one argument as Predicate tye.

    Predicate is essentially a Functional Interface which is feature in Java 8.

    Now, earlier we were creating a new function for every filter.
    Using predicate we can directly pass the filter in the predicate type.

    Predicate has one abstract method test() which is used for boolean comparisons


     */

    public static List<Apple> filter(List<Apple> list, Predicate<Apple> p)
    {
        List<Apple> result = new ArrayList<>();
        for(Apple a: list)
        {
            if(p.test(a))
            {
                result.add(a);

            }
        }

        return result;
    }


    public static boolean isEligibleForExport(List<Apple> list)
    {
        if(list.size() >= exportSize)
        {
            return true;

        }

        return false;
    }




}


class Apple{

    String color;
    double weightInGrams;

    public Apple(String color, double weightInGrams) {
        this.color = color;
        this.weightInGrams = weightInGrams;
    }


}

