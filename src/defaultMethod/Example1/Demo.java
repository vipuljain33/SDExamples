package defaultMethod.Example1;

public interface Demo {

    default void m1()
    {
        System.out.println("Inside default method");
    }


}

class Test implements Demo{

    @Override
    public void m1() {
        System.out.println("Inside overridden implementation of default method");
    }

    public static void main(String[] args)
    {
        Test t = new Test();

        t.m1();
    }
}


