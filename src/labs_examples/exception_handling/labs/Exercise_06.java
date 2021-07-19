package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class Example6 {

    public static void main(String[] args) {

        try {
            methodToPassException();
        } catch (ArithmeticException ae) {
            System.out.println(ae.toString() + ": You cannot divide by 0..");
        }
    }

    public static void methodToPassException() throws ArithmeticException {
        divide(1,0);
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a/b;
    }

}