package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 * <p>
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b) {
            System.out.println("a is less than b");
        }

        if (a <= b) {
            System.out.println("a is less than or equal to b");
        } else {
            System.out.println("b is less than of equal to a");
        }

        if (a > b) {
            System.out.println("a is greater than d");
        } else {
            System.out.println("b is greater than a");
        }

        if (a >= b) {
            System.out.println("a is greater than or equal to b");
        } else {
            System.out.println("b is greater than of equal to a");
        }

        if (a == 10) {
            System.out.println("a equals 10");
        }

    }

}

