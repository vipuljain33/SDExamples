package javathreads.extendsThread;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    public void run()
    {
        System.out.println("MyThread - START " + Thread.currentThread().getName());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("MyThread - END " + Thread.currentThread().getName());
    }

    private void dbProcessing() throws InterruptedException {
        Thread.sleep(5000);
    }
}
