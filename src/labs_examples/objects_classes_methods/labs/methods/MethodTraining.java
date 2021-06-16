package labs_examples.objects_classes_methods.labs.methods;


import java.util.ArrayList;
import java.util.Arrays;

public class MethodTraining {


    public static void main(String[] args) {

        int a = 100;
        int b = 200;
        int c = 300;

        // #2.a pass by value
        System.out.println("-----------Pass by Value----------------");
        System.out.println("Primitive values didn't change, see... a: " + a + " b: " + b + " c: " + c);
        System.out.println(add(a, b, c));
        System.out.println("Primitive values didn't change, see... a: " + a + " b: " + b + " c: " + c);


        // #2.b pass by reference
        System.out.println("-----------Pass by Reference----------------");
        Dog dog = new Dog("Blake");
        Dog dog2 = dog;
        dogName(dog);
        System.out.println("Dog 1 : " + dog.getName() + " Dog 2: " + dog2.getName() + " <--- Name is still Blake");

        // # 3
        int largestNumber = returnLargestOfFourNumbers(55, 20, 600, 1);
        System.out.println("Largest number " + largestNumber);

        // # 4
        int countAllNonVowels = returnCountOfAllVowelsInAString("supercalifragilisticexpialidocious");
        System.out.println("Non vowels = " + countAllNonVowels);

        // # 5
        boolean isPrime = isPrimeNumber(33);
        System.out.println("Is the number prime?: " + isPrime);

        // # 6
        int[] smallAndLargeNumberInArrayOfFour = smallestAndLargestNumbersInNumericArray(1, -2, 500, 4);
        System.out.print("Smallest and Largest number in the array: ");
        System.out.println(Arrays.toString(smallAndLargeNumberInArrayOfFour));

        // # 7
        ArrayList<Integer> arrayList = methodName(20, 2, 4);
        System.out.println(arrayList);
        System.out.println("The size of the arrayList is " + arrayList.size());

        // # 8
        System.out.print("Reverse array is: ");
        System.out.println(Arrays.toString(reverseArray(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));

    }

    public static int[] reverseArray(int...array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;

    }

    public static ArrayList<Integer> methodName(int maxNum, int divisor1, int divisor2) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 0; i < maxNum; i++) {
            integerArrayList.add(i);
            integerArrayList.removeIf(integer -> integer % divisor1 != 0 && integer % divisor2 != 0);
        }
        return integerArrayList;
    }


    public static int[] smallestAndLargestNumbersInNumericArray(int a, int b, int c, int d) {
        int highestNumber = returnLargestOfFourNumbers(a, b, c, d);

        int[] smallNumberArray = new int[]{a, b, c, d};
        int smallestNumber = smallNumberArray[0];


        for (int j : smallNumberArray) {
            if (j < smallestNumber) {
                smallestNumber = j;
            }

        }

        return new int[]{smallestNumber, highestNumber};
    }

    public static boolean isPrimeNumber(int num) {

        if (num <= 1)
            return false;

        for (int i = 2; i < num; i++)
            if (num % i == 0)
                return false;

        return true;
    }

    public static int returnCountOfAllVowelsInAString(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i'
                    && str.charAt(i) != 'o' && str.charAt(i) != 'u') {
                count++;
            }
        }
        return count;

    }

    public static int returnLargestOfFourNumbers(int a, int b, int c, int d) {
        int[] numberArray = new int[]{a, b, c, d};
        int largestNumber = numberArray[0];


        for (int j : numberArray) {
            if (j > largestNumber) {
                largestNumber = j;
            }

        }

        return largestNumber;
    }


    // #1 method overloading
    public static int add(int a, int b, int c) {
        a = a + 5;
        b = b + 5;
        c = c + 5;

        int total = a + b + c;
        System.out.println("Primitive values CHANGED, see... a: " + a + " b: " + b + "c: " + c);
        return total;
    }

    public static int add(double a, double b, double c) {
        a = (int) a;
        b = (int) b;
        c = (int) c;

        return (int) (a + b + c);
    }

    public static int add(int a) {
        return a + 1;
    }

    public static int add(int a, int b, double c) {
        c = (int) c;

        return a + b + (int) c;
    }


    // part of pass by reference
    public static void dogName(Dog d) {
        System.out.println(d.getName() + "<------------ Name is still Blake");
        // change d inside of dogName() to point to a new Dog "Caine"
        d = new Dog("Caine");
        System.out.println("Dog name: " + d.getName() + " <---- Name is changed here");
    }

}

class Dog {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}



