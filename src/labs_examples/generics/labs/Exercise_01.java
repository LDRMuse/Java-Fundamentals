package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 * <p>
 * 1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 * 2.) Create a few objects of your generic class with different data types to demonstrate it's
 * dynamic usage.
 */


class GenericExample_1<T, B> {
    T val1;
    B val2;


    public GenericExample_1(T val1, B val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public T getVal1() {
        return val1;
    }

    public void setVal1(T val1) {
        this.val1 = val1;
    }

    public B getVal2() {
        return val2;
    }

    public void setVal2(B val2) {
        this.val2 = val2;
    }

    public void print() {
        System.out.println(val1 + ", " + val2);
    }
}

class genericController {
    public static void main(String[] args) {
        GenericExample_1<String, String> genericString1 = new GenericExample_1<>("Hi", "bye");
        GenericExample_1<Integer, Boolean> genericString2 = new GenericExample_1<>(5, true);
        GenericExample_1<Integer, Double> genericString3 = new GenericExample_1<>(29, 5.123456);

        genericString1.print();
        genericString2.print();
        genericString3.print();

    }
}