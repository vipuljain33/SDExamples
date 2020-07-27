package lambdas.examples;

public class Demo_Examples {


    public static void main(String args[])
    {


        HelloInterface helloInterface = () -> System.out.println("Hello");

        helloInterface.printHello();

        AddInterface addInterface = (a,b) ->System.out.println(a+b);

        addInterface.add(10, 20);

        LengthInterface lengthInterface = s -> s.length();

        System.out.println(lengthInterface.getLength("Hello"));

        System.out.println(lengthInterface.getLength("Hello World"));


    }
}
