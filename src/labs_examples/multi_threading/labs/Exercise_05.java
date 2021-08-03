package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 * <p>
 * Demonstrate the use of a wait() and notify()
 */
 class Application
{
    public static void main(String[] args)
    {
        System.out.println("Main thread started ");

        ThreadA threadA = new ThreadA();
        threadA.start();
        System.out.println("ThreadA was started");

        synchronized (threadA)
        {
            try {
                System.out.println("Main thread is waiting for ThreadA ");
                threadA.wait();
                System.out.println("Main thread resumed again");
            } catch (InterruptedException e) {
                System.out.println("waiting thread interrupted ");
            }
        }

        System.out.println("Main thread completed ");
    }
}


class ThreadA extends Thread
{
    public void run()
    {
        synchronized (this) {
            System.out.println("ThreadA is running");
            notify();
            System.out.println("ThreadA called notify() on its own");

            try {
                System.out.println("ThreadA sleeps for 5 seconds");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("sleeping thread interrupted ");
            }
            System.out.println("ThreadA synchronization block completed");
        }
    }
}