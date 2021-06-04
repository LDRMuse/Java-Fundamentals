package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 * <p>
 * Write the necessary code to calculate the volume and surface area of a cylinder
 * with a radius of 3.14 and a height of 5. Print out the result.
 */

public class Exercise_06 {

    public static void main(String[] args) {

        double radius = 3.14;
        int height = 5;
        double pie = 3.14285714286;
        double volume = pie * (radius * radius) * height;
        double surfaceArea = pie * radius * (radius + height);

        System.out.println("Volume = " + volume);
        System.out.println("Surface Area = " + surfaceArea);

    }
}