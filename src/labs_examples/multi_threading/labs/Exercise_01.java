package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 * <p>
 * 1: Create an application that starts a Thread by implementing the Runnable interface
 * 2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 */


class Main {
    public static void main(String[] args) {

        MyRunnable myRunnable1 = new MyRunnable("one");
        MyRunnable myRunnable2 = new MyRunnable("two");

        MyOtherRunnable myOtherRunnable = new MyOtherRunnable();
        myOtherRunnable.run();

        myRunnable1.thread.setPriority(5);
        myRunnable2.thread.setPriority(10);

        myRunnable1.thread.start();
        myRunnable2.thread.start();


    }
}

class MyRunnable implements Runnable {

    Thread thread;

    public MyRunnable(String name){
        thread = new Thread(this, name);
    }

    @Override
    public void run(){
        System.out.println("I'm in a thread name " + thread.getName() + "!");
    }

}

class MyOtherRunnable implements Runnable {
    @Override
    public void run(){
        System.out.println("I'm in a thread name " + Thread.currentThread().getName() + "!");
    }
}