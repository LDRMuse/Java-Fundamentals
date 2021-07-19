package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

 class Exercise1 {

    public static void main(String[] args) {
        exercise1Method();
    }

    public static void exercise1Method(){
        int[] numbers = {1,2,3};
        try {
            System.out.println(numbers[4]);
        } catch (Exception e) {
            System.out.println("The index of " + e.getMessage() + " does not exist");
        }
    }

}