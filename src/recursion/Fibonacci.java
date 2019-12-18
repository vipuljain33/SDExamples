package recursion;

/**
 * Created by vipuljain on 13/07/18.
 */
public class Fibonacci {

    public static int fibonacci(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        if(n == 0)
            return 0;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args)
    {
        int result = fibonacci(5);

        System.out.println(result);
    }


    public static int fib(int n)
    {
        if(n <=1)
        {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
}
