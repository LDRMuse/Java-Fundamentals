package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 * <p>
 * Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 * calculate the sum of all of the numbers in the array as well as the average.
 * <p>
 * Print the results to the console.
 */

public class Exercise_01 {

    public static void main(String[] args) {

        System.out.println("Please enter 10 numbers");

        Scanner scanner = new Scanner(System.in);

        try {
            if (scanner.hasNextInt()) {

                int numberOne = scanner.nextInt();
                int numberTwo = scanner.nextInt();
                int numberThree = scanner.nextInt();
                int numberFour = scanner.nextInt();
                int numberFive = scanner.nextInt();
                int numberSix = scanner.nextInt();
                int numberSeven = scanner.nextInt();
                int numberEight = scanner.nextInt();
                int numberNine = scanner.nextInt();
                int numberTen = scanner.nextInt();

                int[] tenNumbersArray = new int[10];

                tenNumbersArray[0] = numberOne;
                tenNumbersArray[1] = numberTwo;
                tenNumbersArray[2] = numberThree;
                tenNumbersArray[3] = numberFour;
                tenNumbersArray[4] = numberFive;
                tenNumbersArray[5] = numberSix;
                tenNumbersArray[6] = numberSeven;
                tenNumbersArray[7] = numberEight;
                tenNumbersArray[8] = numberNine;
                tenNumbersArray[9] = numberTen;

                int sum = 0;
                int average = 0;

                for (int k : tenNumbersArray) {
                    sum += k;
                }

                for (int j : tenNumbersArray) {
                    average += j / 10;
                }

                System.out.println("Sum of 10 numbers: " + sum);
                System.out.println("Average of 10 numbers: " + average);

            } else if (!scanner.hasNextInt()) {
                System.out.println("That is not a number");
            }
        }
        catch(Exception e) {
            System.out.println("That is not a number, try again.");
        }



    }



}