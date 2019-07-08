package javathreads.runnableinterface;

public class Demo {

    public static void main(String[] args)
    {
        Thread t1 = new Thread(new HeavyWorkRunnable(), "t1");
        Thread t2 = new Thread(new HeavyWorkRunnable(), "t2");
        t1.start();
        t2.start();
    }
}
