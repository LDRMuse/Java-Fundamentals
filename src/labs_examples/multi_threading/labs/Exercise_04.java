package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

class Sender {
    public void send(String msg) {
        System.out.println("Sending\t" + msg );
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("\n" + msg + "Sent");
    }
}


// Class for sending a message using Threads
class Threader extends Thread {
    private final String msg;
    private Thread thread;
    final Sender sender;


    // Constructor receives a message object and a string message to be sent
    Threader(String message, Sender object) {
        msg = message;
        sender = object;
    }
    public void run() {
        // Only one thread can send a message at a time.
        synchronized(sender) {
            // synchronizing the snd object
            sender.send(msg);
        }
    }
}


// Driver class
class Runner {
    public static void main(String args[])  {
        Sender sender = new Sender();
        Threader s1 = new Threader( " Hello " , sender );
        Threader s2 = new Threader( " Goodbye " , sender );
        // Start two threads of ThreadedSend type
        s1.start();
        s2.start();


        // wait for threads to end
        try {
            s1.join();
            s2.join();
        } catch(Exception e){
            System.out.println("Interrupted");
        }
    }
}