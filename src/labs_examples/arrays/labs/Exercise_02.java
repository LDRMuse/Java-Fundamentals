package labs_examples.arrays.labs;

import com.sun.tools.javac.util.ArrayUtils;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

/**
 * More labs_examples.arrays
 * <p>
 * Using the array below, take in a number from 1-10 from the user and print out the index of that
 * element.
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Enter a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        try {
            int userInput = scanner.nextInt();

            if (userInput < 1 || userInput > 10) {
                System.out.println("That's not a number between 1 and 10");
            }

            for (int i : array) {
                if (i == userInput) {
                    System.out.println("The array value at the index of " + userInput + " is: " + findIndexOfInput(array, userInput));
                }
            }
        } catch (Exception e) {
            System.out.println("That is not a number, try again.");
        }

    }
    public static int findIndexOfInput(int[] array, int input)
    {

        if (array == null) {
            return -1;
        }

        int length = array.length;
        int i = 0;

        while (i < length) {

            if (array[i] == input) {
                System.out.println(i);
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
}