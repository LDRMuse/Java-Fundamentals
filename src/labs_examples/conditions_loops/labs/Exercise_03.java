package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 3: Months of the year
 * <p>
 * Take in a number from the user and print "January", "February", ... "December", or "Other"
 * if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 */

public class Exercise_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number that is between 1 and 12. We will give you the month that correlates with your input.");
        if (scanner.hasNextInt()) {
            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("That is not a number between 1 and 12");
            }
        } else {
            System.out.println("That is not a number.");
        }

    }

}
