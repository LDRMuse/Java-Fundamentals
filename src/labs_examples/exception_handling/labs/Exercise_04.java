package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 * <p>
 * Demonstrate a nested try/catch.
 */
class Exercise4 {
    public static void main(String args[]) {
        try {
            try {

                int numbers[] = {1,2,3};

                System.out.println(numbers[5]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("There is no index of: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Exceptipm: " + e.getMessage());

        }
    }

}