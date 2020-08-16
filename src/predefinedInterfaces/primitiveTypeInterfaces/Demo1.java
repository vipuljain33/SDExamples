package predefinedInterfaces.primitiveTypeInterfaces;

import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class Demo1 {

    public static void main(String[] args)
    {

        IntFunction<Integer> f1 = i -> i*i;

        System.out.println(f1.apply(5));

        ToIntFunction<String> f2 = s -> s.length();

        System.out.println(f2.applyAsInt("Vipul"));



    }

}
