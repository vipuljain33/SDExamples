package javathreads.runnableinterface;

import sun.awt.windows.ThemeReader;

public class HeavyWorkRunnable implements Runnable {
    @Override
    public void run() {

        System.out.println("Doing heavy processing - START " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            dbProcessing();

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Doing heavy processing - END " + Thread.currentThread().getName());
    }

    private void dbProcessing() throws InterruptedException {
        Thread.sleep(5000);
    }
}
