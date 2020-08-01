package poc;

public class Demo  {

    public static void main(String[] args)
    {
        Interf i = new Interf() {
            @Override
            public void fun1() {
                System.out.println("Inside fun1");
            }
        };


        i.fun1();

    }

}
