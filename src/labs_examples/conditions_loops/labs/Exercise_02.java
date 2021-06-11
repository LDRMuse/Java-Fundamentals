package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        // 2) prompt user
        // 3) assign input to variable as int
        // 4) write completed code here

        System.out.println("Write a number between 1 and 7 to correlate the day of the week that this number represents: ");
        Scanner scanner = new Scanner(System.in);

        if(scanner.hasNextInt()) {
          int userNumber = scanner.nextInt();

            switch (userNumber) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("That is not a number between 1 and 7");
            }
        } else {
            System.out.println("That is not an umber between 1 and 7");
        }

    }
}
