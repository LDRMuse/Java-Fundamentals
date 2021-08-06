package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 * <p>
 * Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 * Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */

import java.util.ArrayList;

class Demo {


    public int printArray(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }


}

class Exercise2Controller {
    public static void main(String[] args) {
        Demo demo = new Demo();
        ArrayList<Integer> array = new ArrayList<>();
        array.add(0, 10);
        array.add(1, 1);
        array.add(2, 100);
        array.add(3, 11);
       int numberSum = demo.printArray(array);
        System.out.println(numberSum);

    }


}