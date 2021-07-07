package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;


class PlantController {
    public static void main(String[] args) {

        FruitPlant appleTree = new FruitPlant(false, 0, "Green Apple Tree");
        appleTree.water();
        appleTree.trim();
        System.out.println(appleTree.toString());

        FloweringPlant sunflower = new FruitPlant(true, 0,"Sunflower");

        DecorPlant sunflowerBonsai = new DecorPlant(sunflower);
        sunflowerBonsai.plant.water();
        appleTree.trim();
        sunflowerBonsai.plant.trim();

    }
}

public interface Plant {

    public void water();

    public int trim();

}

abstract class FloweringPlant implements Plant {

    boolean inDoor;

    public FloweringPlant(boolean inDoor) {
        this.inDoor = inDoor;
    }


    public boolean isInDoor() {
        return inDoor;
    }

    public void setInDoor(boolean inDoor) {
        this.inDoor = inDoor;
    }

    @Override
    public void water() {
        System.out.println("Watering from the + " + getClass() + " class");
    }
}

class FruitPlant extends FloweringPlant {
    int numberOfFruit = 0;
    String nameOfPlant;

    public FruitPlant(boolean inDoor, int numberOfFruit, String nameOfPlant) {
        super(inDoor);
        this.numberOfFruit = numberOfFruit;
        this.nameOfPlant = nameOfPlant;
    }

    public int getNumberOfFruit() {
        return numberOfFruit;
    }

    public void setNumberOfFruit(int numberOfFruit) {
        this.numberOfFruit = numberOfFruit;
    }

    public String getNameOfPlant() {
        return nameOfPlant;
    }

    public void setNameOfPlant(String nameOfPlant) {
        this.nameOfPlant = nameOfPlant;
    }

    @Override
    public String toString() {
        return "FruitPlant{" +
                "inDoor=" + inDoor +
                ", numberOfFruit=" + numberOfFruit +
                ", nameOfPlant='" + nameOfPlant + '\'' +
                '}';
    }


    @Override
    public int trim() {
        return 0;
    }
}

class DecorPlant {

    Plant plant;

    public DecorPlant(Plant plant) {
        this.plant = plant;
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    @Override
    public String toString() {
        return "DecorPlant{" +
                "plant=" + plant +
                '}';
    }
}
