package labs_examples.objects_classes_methods.labs.objects;


//Building off the previous classes we created in Exercise_01
//
//        1) Create a toString() method in each POJO. You can do this by holding down the Control key and hitting
//        enter at the same time. If you see a small menu choose toString() and generate from there. Otherwise you can
//        select "Code" from the top most navbar of IntelliJ and then select "Generate" and choose toString();
//
//        2) In the main() method you created in the controller classes demonstrate creating a number of Objects using a variety
//        of constructors that you created in the previous exercise.
//
//        3) After creating these objects, print the status of these objects. For example:
//        System.out.println(cardObj.toString())
//
//


class Exercise1 {
    public static void main(String[] args) {
        Engine engine = new Engine(1000);

        Model model = new Model();
        model.setBrand("Tesla");

        Person pilot = new Person();
        pilot.setName("Melissa");
        pilot.setOccupation("Pilot");

        Airport airport = new Airport();
        airport.setAirport("LAX");
        airport.setLocation("California");

        Airplane airplane = new Airplane(model, pilot, engine, airport, 1000, "full");

        System.out.println("The airplane is at " + airport.getAirport() + " in " + airport.getLocation());
        System.out.println("The pilot " + pilot.getName() + " has been a " + pilot.getOccupation() + " for 10 years!");
        System.out.println("The model of the airplane is " + model.getBrand() + " and the horsepower of the engine is " +
                engine.horsePower + " and the fuel tank is " + airplane.getFuelCapacity());
        System.out.println("All of the airplanes data: " + airplane);

    }

}


class Model {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String tesla) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Model{" +
                "brand=" + brand +
                '}';
    }
}

class Person {
    private String name;
    private String occupation;


    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +
                "occupation=" + occupation +
                '}';
    }

}

class Airport {
    private String airport;
    private String location;

    public String getAirport() {
        return airport;
    }

    public String getLocation() {
        return location;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "Airport name=" + airport +
                "location=" + location +
                '}';
    }
}


class Airplane {

    Model model;
    Person person;
    Engine engine;
    Airport airport;
    private double fuelCapacity;
    private String currentFuelLevel;

    public Airplane(Model model, Person person, Engine engine, Airport airport, double fuelCapacity, String currentFuelLevel) {
        this.model = model;
        this.person = person;
        this.engine = engine;
        this. airport = airport;
        this. fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;

    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public String getCurrentFuelLevel() {
        return currentFuelLevel;
    }


    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setCurrentFuelLevel(String currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "model=" + model.getBrand() +
                "pilot=" + person.getName() +
                "engine=" + engine.toString() +
                "airport=" + airport.getAirport() +
                "fuel capacity=" + fuelCapacity +
                "current fuel level=" + currentFuelLevel +
                '}';
    }
}