package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 * ArrayLists
 * <p>
 * Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 * Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 * typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 * shows a list of methods.
 */
public class Exercise_07 {

    public static void main(String[] args) {

        ArrayList<String> pets = new ArrayList<>();

        pets.add("dog");
        pets.add("cat");
        pets.add("bird");
        pets.add("monkey");

        if(!pets.isEmpty()) {
            for (String pet : pets) {
                System.out.print(pet.toUpperCase() + " ");
            }
        }

        System.out.println();

        if(pets.contains("cat")) {
            pets.remove("cat");
            System.out.println(pets + " <-- Should have removed cat");
        }

        pets.add("horse");
        pets.add("goose");
        pets.add("bearded dragon");
        pets.add("ant");

        System.out.println(pets.get(6));

        if(pets.get(3) == null) {
            System.out.println(pets.get(3));
        } else {
            System.out.println("The pet " + pets.get(3) + " exists in the ArrayList");
        }


        }


}


