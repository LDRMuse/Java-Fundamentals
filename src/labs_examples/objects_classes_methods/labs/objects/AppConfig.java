package labs_examples.objects_classes_methods.labs.objects;

public class AppConfig {

    public static void main(String[] args) {
        Oven oven = new Oven(true, 500, "GE");
        Dishwasher dishwasher = new Dishwasher(true, "Whirlpool", 7);
        Refrigerator fridge = new Refrigerator(true, "GE");
        Sink sink = new Sink(false, false, "Unknown");
        Kitchen kitchen = new Kitchen(oven, dishwasher, fridge, sink);

        System.out.println("My kitchen has a " + kitchen.getDishwasher().getBrand() + " dishwasher, that is " + dishwasher.getYearsOld() + " years old");

        // Kitchen has a toString() method and I cam calling it here.
        System.out.println(kitchen.toString());
    }

}
