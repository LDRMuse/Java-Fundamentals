package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        byte b = 100;
        System.out.println("A byte primitive type is between -127 and 128. Variable myByte is: " + b);

        short s = 4000;
        System.out.println("A short primitive type ranges from -32,768 and 32,767. Variable myShort is: " + s);

        int i = 1;
        System.out.println("An int primitive type ranges from -2,147,483,648 to 2,147,483,647. Variable myInt is: " + i);

        long l = 100000000L;
        System.out.println("A long primitive type is the larger version of an Integer: " + l);

        float f = 1.1234567f;
        System.out.println("A float primitive type has up to 7 decimal places. Example: " + f);

        double d = 3.12345678910111213;
        System.out.println("A double primitive type is a larger version of a float. Example: " + d);

        boolean isTrue = true;
        System.out.println("Variable isTrue is: " + isTrue);

        char c = 'c';
        System.out.println("The char primitive type is a single character: " + c);

    }

}
