package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */


class ThreadDemo {
    // Shared object
    static Print print = new Print();

    public static void main(String[] args) {

        new Thread(new ThreadOne()).start();
        new Thread(new ThreadTwo()).start();

    }
}

class ThreadTwo implements Runnable {

    @Override
    public void run() {
        ThreadDemo.print.printFromThreadTwo();

    }

}

class ThreadOne implements Runnable {

    @Override
    public void run() {

        ThreadDemo.print.printFromThreadOne();
    }

}

class Print {
    public boolean flag = false;

    public synchronized void printFromThreadTwo() {

        for (int i = 1; i <= 100; i++) {
            if (!flag) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                if (i % 2 == 0) {
                    System.out.println("from thread two: " + i);
                    flag = false;
                    notifyAll();
                }

            }
        }
    }

    public synchronized void printFromThreadOne() {
        for (int i = 1; i <= 100; i++) {
            if (flag) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                if (i % 2 != 0) {
                    System.out.println("from thread one: " + i);
                    flag = true;
                    notifyAll();
                }

            }
        }
    }
}
