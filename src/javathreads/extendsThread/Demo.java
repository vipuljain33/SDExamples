package javathreads.extendsThread;

public class Demo {

    public static void main(String[] args) {

        Thread t1 = new MyThread("t1");
        Thread t2 = new MyThread("t2");

        t1.start();
        t2.start();

    }


}
