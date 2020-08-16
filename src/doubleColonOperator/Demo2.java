package doubleColonOperator;

public class Demo2 {

    public Demo2(String s) {

        System.out.println("Inside Demo2 class constructor");
    }

    public static void main(String[] args)
    {


        Inter i =  Demo2::new;

        Demo2 d =  i.get("Amit");

    }


}

interface Inter
{

    public Demo2 get(String s);
}
