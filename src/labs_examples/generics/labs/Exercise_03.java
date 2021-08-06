package labs_examples.generics.labs;


/**
 * Generics Exercise 3:
 * <p>
 * 1) Write a generic method that accepts two generic arguments. This generic method should only accept
 * arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 * numbers were passed in regardless of their type.
 * <p>
 * 2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes
 * <p>
 * 3) Write a generic method to exchange the positions of two different elements in an array.
 * <p>
 * 4) Write a generic method to find the largest element within the range (begin, end) of a list.
 */

class Exercise3 {

    public Exercise3() {
    }


    public static void main(String[] args) {

        // 1
        double a = multiply(2.2, 3.3);
        System.out.println(a);

        // 2
        String b = "racecarappleseesyesmmtewtnykk";
        countPalindromes(b);

        // 3
        String[] stringArray = {"swap", "this"};
        swap(stringArray,0,1);
        System.out.println(stringArray[0] + "," + stringArray[1]);

        // 4
        double d = getMax(1, 2, 3);
        System.out.println(d);


    }

    // 1
    public static <T extends Number, V extends Number> double multiply(T a, V b) {
        return a.intValue() * b.intValue();
    }

    // 2
    private static int countPalindromes(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            char start = str.charAt(i);
            String st = "";
            st += start;
            for (int j = i + 1; j < str.length(); j++) {

                st += str.charAt(j);

                StringBuffer rev = new StringBuffer(st).reverse();
                if (st.equals(rev.toString()) && st.length() > 1) {
                    count++;
                }
            }

        }

        System.out.println("Total Count of palindromes: " + count);

        return count;
    }


    // 3
        public static <T> void swap(T[] a, int i, int j) {
            T temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }


    // 4
    public static <T extends Comparable<T>> T getMax(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(y) > 0) {
            max = z;
        }
        return max;
    }


}
