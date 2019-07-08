package javathreads.joinExample;

import sun.awt.windows.ThemeReader;

public class ThreadJoinExample {

    public static void main(String[] args)
    {

        Thread t1 = new Thread(new Myrunnable(), "t1");
        Thread t2 = new Thread(new Myrunnable(), "t2");
        Thread t3 = new Thread(new Myrunnable(), "t3");



        //First t1 starts
        t1.start();


        //next thread will not start until 2000ms
        try {
            t1.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //t2 starts after 2000ms
        t2.start();


        //start next thread only when first thread is dead
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //t3 starts when t1 is dead
        t3.start();


        //let all threads finish execution before main thread is dead
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("All threads are dead, exiting main thread");


    }
}


class Myrunnable implements Runnable
{

    @Override
    public void run() {

        System.out.println("Thread started:::"+Thread.currentThread().getName());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended:::"+Thread.currentThread().getName());

    }
}
