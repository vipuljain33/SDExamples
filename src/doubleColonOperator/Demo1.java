package doubleColonOperator;



public class Demo1 {

    public static void m2(int a)
    {
        System.out.println("This is static method m2 in class Demo1");
    }

    public static void main(String[] args)
    {

        Demo1 demo1 = new Demo1();

        //Method reference
        Interf i = Demo1::m2;

        //Method reference
        Interf i2 = demo1::m3;
        i.m1(10);

        i2.m1(34);



    }

    public void m3(int a)
    {
        System.out.println("This is an instance method m3 in class Demo1");
    }

}


interface Interf
{
    public void m1(int a);
}