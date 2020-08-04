package predefinedInterfaces.functions;

import java.util.function.Function;

public class Demo1 {


    public static void main(String[] args)
    {

        Function<String, Integer> fun1 = (s) -> s.length();

        System.out.println(fun1.apply("Vipul"));

        //Remove whitespaces from a string

        String s = "This is my book";

        Function<String, String> fun2 = (s1) -> s.replaceAll(" ", "");

        System.out.println(fun2.apply(s));

        Function<String, Integer> fun3 = (s1) -> s1.length() - s1.replaceAll(" ", "").length();

        System.out.println(fun3.apply(s));
    }
}
