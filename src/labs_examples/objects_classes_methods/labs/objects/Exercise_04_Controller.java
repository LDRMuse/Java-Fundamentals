package labs_examples.objects_classes_methods.labs.objects;

public class Exercise_04_Controller {

    public static void main(String[] args) {

        // using 3 different Constructors
        // 1
        Exercise_04_Pojo firstConstructor = new Exercise_04_Pojo();
        int myFavNumber = firstConstructor.myFavoriteNumber = 5;
        System.out.println(myFavNumber);

        // 2
        Exercise_04_Pojo secondConstructor = new Exercise_04_Pojo();
        String myFavColor = secondConstructor.setMyFavoriteColor("Sage");
        System.out.println(myFavColor);

        // 3
        Exercise_04_Pojo thirdConstructor = new Exercise_04_Pojo();
        String myFavColor3 = thirdConstructor.myFavoriteColor = "Blush";
        String nameOfPojo = thirdConstructor.nameOfPojo = "Bob POJO";
        System.out.println(myFavColor3 + ", " + nameOfPojo);
    }
}
