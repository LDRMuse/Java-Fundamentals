package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */
/**
 * Implement the Runnable interface
 *
 * Methods to use:
 *
 * super();
 * start();
 * Thread.sleep();
 *
 */

class MainClass {
    public static void main(String[] args) {

        MyThread myThread = new MyThread("Thread One");

        MyOtherThread myOtherThread = new MyOtherThread();
        myOtherThread.start();
    }
}

class MyThread extends Thread {

    public MyThread(String name){
        super(name);
        start();
    }

    @Override
    public void run(){
        System.out.println("I'm in a thread name " + getName() + "!");
    }
}

class MyOtherThread extends Thread {

    @Override
    public void run(){
        System.out.println("I'm in a thread name " + getName() + "!");
    }
}