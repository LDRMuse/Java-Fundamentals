package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 * <p>
 * Demonstrate a try/catch with multiple catch statements.
 */


class Exercise2 {

    public static void main(String[] args) {
        exercise2Method();
    }

    public static void exercise2Method() {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index of " + e.getMessage() + " does not exist");
        } catch (Exception e) {
            System.out.println(e.toString());
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }

}