package predefinedInterfaces.functions;

import java.util.function.Function;

public class FunctionChainingExample {

    public static void main(String[] args)
    {
        Function<String, String> f1 = s -> s.toUpperCase();

        Function<String, String> f2 = s -> s.trim();

        Function<String, Integer> f3 = s -> s.length();

        System.out.println("Initial length of string = "+ f3.apply("    This is a trimmed string      "));



        int finalLength = f1.andThen(f2).andThen(f3).apply("    This is a trimmed string      ");


        System.out.println("Final length of string = "+ finalLength);

    }
}
