package lambdas.anonymousExample.example2;

interface Demo {


    public void m1();


};


class Test{
    int x = 10;

    public void m2()
    {
        Demo d = () -> {

            int x = 20;
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