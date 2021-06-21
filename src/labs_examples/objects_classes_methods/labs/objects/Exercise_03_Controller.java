package labs_examples.objects_classes_methods.labs.objects;

public class Exercise_03_Controller {

    public static void main(String[] args) {
        Exercise_03_Pojo1 firstPojo = new Exercise_03_Pojo1();
        Exercise_03_Pojo2 secondPojo = new Exercise_03_Pojo2();

        firstPojo.setPojoOneMessage("I am the first POJO!!!");
        secondPojo.setPojoTwoMessage("I am the second POJO!!!");

        System.out.println(firstPojo.getPojoOneMessage() + " and " + secondPojo.getPojoTwoMessage());


        Person person = new Person();
        person.setName("Britney Spears");
        person.setOccupation("Triple threat: Singer, Dancer, Actor.");

        Exercise_04_Pojo pojo1 = new Exercise_04_Pojo(1111);
        System.out.println(pojo1.myFavoriteNumber);

        Exercise_04_Pojo pojo2 = new Exercise_04_Pojo("Bill POJO");
        System.out.println("Pojo2:" + pojo2.toString());

        Exercise_04_Pojo pojo3 = new Exercise_04_Pojo();
        pojo3.myFavoriteColor = "sage";

        Exercise_04_Pojo pojo4 = new Exercise_04_Pojo("Lavender", 1);

        System.out.println(person.toString());
        System.out.println(pojo4.myFavoriteColor);
        System.out.println(pojo4.toString());

        // Using the actual constructor
        Exercise_04_Pojo exercise_04_Pojo = new Exercise_04_Pojo();
        System.out.println(exercise_04_Pojo.myFavoriteNumber);
    }
}
