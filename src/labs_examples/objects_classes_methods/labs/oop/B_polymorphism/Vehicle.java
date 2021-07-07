package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

class VehicleController{
    public static void main(String[] args) {

    Car cavalier = new Cavalier(true, 80_000);

    cavalier.honk();
    cavalier.start();

    }
}

public interface Vehicle {

    public void start();

    public void stop();

    public void fillFuel();

    public void honk();
}

abstract class Car implements Vehicle{

    boolean coupe;
    int miles;

    // Overloading the Constructors
    public Car(boolean coupe) {
        this.coupe = coupe;
    }

    // Overloading the Constructors
    public Car(int miles) {
        this.miles = miles;
    }

    // Overloading the Constructors
    public Car(boolean coupe, int miles) {
        this.coupe = coupe;
        this.miles = miles;
    }

    public boolean isCoupe() {
        return coupe;
    }

    public void setCoupe(boolean coupe) {
        this.coupe = coupe;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    // Overriding the methods from the Vehicle Interface
    @Override
    public void start() {
        System.out.println("Starting from the Car class");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the car");

    }


    @Override
    public String toString() {
        return "Car{" +
                "coupe=" + coupe +
                '}';
    }
}

class Cavalier extends Car {

    public Cavalier(boolean coupe) {
        super(coupe);
    }

    public Cavalier(int miles) {
        super(miles);
    }

    public Cavalier(boolean coupe, int miles) {
        super(coupe, miles);
    }

    @Override
    public void fillFuel() {
        System.out.println("Filling Fuel from the Cavalier class");
    }

    @Override
    public void honk() {
        System.out.println("Honking horn from the Cavalier class");
    }

    @Override
    public String toString() {
        return "Cavalier{" +
                "coupe=" + coupe +
                ", miles=" + miles +
                '}';
    }
}
