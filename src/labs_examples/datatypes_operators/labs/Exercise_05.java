package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        if(a & b ) {
            System.out.println("both a && b true");
        } else {
            System.out.println("This got printed instead");
        }

        if(a && b ) {
            System.out.println("Print if both a && b true");
        } else {
            System.out.println("Print this instead");
        }

        if(!a | !b) {
            System.out.println("One of these should make this message print to the console");
        }

        if(a || b) {
            System.out.println("a or/or b is true");
        }

        if (a ^ b) {
            System.out.println("Using XOR");
        }


    }

}

