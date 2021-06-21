package labs_examples.objects_classes_methods.labs.objects;

//The second class is a POJO. Just a simple object type class that defines an object. In this POJO, demonstrate
//        at least three overloaded constructors. In the main() method, create at least 3 objects of your POJO class, each using
//        a different constructor.


public class Exercise_04_Pojo {
    // instance variables
    String nameOfPojo;
    int myFavoriteNumber;
    String myFavoriteColor;


    // constructors
    public Exercise_04_Pojo(){}

    public Exercise_04_Pojo(String nameOfPojo) {
        this.nameOfPojo = nameOfPojo;
    }

    public Exercise_04_Pojo(int myFavoriteNumber) {
        this.myFavoriteNumber =  myFavoriteNumber;
    }

    public Exercise_04_Pojo(String myFavoriteColor, int myFavoriteNumber) {
        this.myFavoriteColor = myFavoriteColor;
        this.myFavoriteNumber = myFavoriteNumber;
    }

    public String setMyFavoriteColor(String myFavoriteColor) {
        this.myFavoriteColor = myFavoriteColor;
        return myFavoriteColor;
    }

    public void setNameOfPojo(String nameOfPojo) {
        this.nameOfPojo = nameOfPojo;
    }

    public void setMyFavoriteNumber(int myFavoriteNumber) {
        this.myFavoriteNumber = myFavoriteNumber;
    }

    public String getMyFavoriteColor() {
        return myFavoriteColor;
    }

    public String getNameOfPojo() {
        return nameOfPojo;
    }

    public int getMyFavoriteNumber() {
        return myFavoriteNumber;
    }

    @Override
    public String toString() {
        return "Exercise_04_Pojo{" +
                "nameOfPojo='" + nameOfPojo + '\'' +
                ", myFavoriteNumber=" + myFavoriteNumber +
                ", myFavoriteColor='" + myFavoriteColor + '\'' +
                '}';
    }

}
