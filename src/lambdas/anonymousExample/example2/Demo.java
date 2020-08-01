package lambdas.anonymousExample.example2;

interface Demo {


    public void m1();


};


class Test{
    int x = 10;

    public void m2()
    {
        int x = 20;
        Demo d = () -> {

            System.out.println(x);

        };

        d.m1();
    }

    public static void main(String[] args)
    {
        Test t = new Test();

        t.m2();
    }
}