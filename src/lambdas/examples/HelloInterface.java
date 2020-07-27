package lambdas.examples;


@FunctionalInterface
public interface HelloInterface {

    public void printHello();


    default void test()
    {
        System.out.println("This is default interface");
    }

    public static void staticTest()
    {
        System.out.println("This is a static method");
    }
}

@FunctionalInterface
interface testInterface extends HelloInterface
{


}


