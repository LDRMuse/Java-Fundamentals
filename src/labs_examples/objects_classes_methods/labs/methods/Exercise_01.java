package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int multiplyMethodCalled = multiply(100,100);
        int divideMethodCalled = divide(200,100);

        System.out.println(multiplyMethodCalled);
        System.out.println(divideMethodCalled);

        myFavJokeQuestion();
        numberOfSecondsInYears(2);

        int varArgsMethodCallOne = varArgsMethod("hi", "yo", "sup", "hey", "ola", "hallo");
        int varArgsMethodCallTwo = varArgsMethod("bye");
        int varArgsMethodCallThree = varArgsMethod("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");

        System.out.println(varArgsMethodCallOne);
        System.out.println(varArgsMethodCallTwo);
        System.out.println(varArgsMethodCallThree);


    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b

    public static int multiply(int a, int b) {
        return a * b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b

    public static int divide(int a, int b) {
        return a / b;
    }


    // 3) Create a static void method that will print of joke of your choice to the console

    public static void myFavJokeQuestion() {
        System.out.println("Q: What does a nosey pepper do??");
        myFavJokeAnswer();

    }

    public static void myFavJokeAnswer() {
        System.out.println("A: Gets JALAPENO business!!");

    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents

    public static int numberOfSecondsInYears(int years) {
        int secondsInAYear = 31_556_952;
        int totalNumOfSecondsCalculated = multiply(years, secondsInAYear);
        System.out.println(totalNumOfSecondsCalculated + " seconds = " + years + " year(s)" );
        return totalNumOfSecondsCalculated;
    }


    // 5) Create a varargs method that will return the length of the varargs array passed in

public static int varArgsMethod(String... args) {
        int count = 0;

        for (String a : args) {
            count++;
        }
        return count;
}




}
