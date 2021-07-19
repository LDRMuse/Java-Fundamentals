package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
class Exercise3 {

    public static void main(String[] args) {
        exercise3Method();
    }

    public static void exercise3Method() {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index of " + e.getMessage() + " does not exist");
        } catch (Exception e) {
            System.out.println(e.toString());
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program ended");
        }
    }

}