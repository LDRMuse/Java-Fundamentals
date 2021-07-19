package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {

        try {
            divide(1,0);
        } catch (ArithmeticException ae) {
            System.out.println(ae.toString() + ": You cannot divide by 0..");
        }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a/b;
    }

}