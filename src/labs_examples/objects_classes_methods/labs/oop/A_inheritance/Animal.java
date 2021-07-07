package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

class AnimalController{
    public static void main(String[] args) {

        Pet dog = new Pet("Canine", "brown", 4, "Blake");

        WildAnimal deer = new WildAnimal("deer", "brown", 4, "Woods");
        deer.makeSound();

        PetBreed petBreed = new PetBreed(dog.getSpecies(), dog.getEyeColor(), dog.getLegs(), dog.getName(), "German Shepherd");
        petBreed.makeSound();

        ZooAnimal zooAnimal = new ZooAnimal("Bird", "black", 2, "cage");
        zooAnimal.makeSound();

        Animal animalDog = new Animal(dog.getSpecies());
        dog.makeSound();
        animalDog.makeSound();
    }
}

public class Animal {
    String species;
    String eyeColor;
    int legs;

    public Animal(String species){}

    public Animal(String species, String eyeColor, int legs) {
        this.species = species;
        this.eyeColor = eyeColor;
        this.legs = legs;
    }

    public Animal() {

    }

    public void makeSound() {
        System.out.println("I am making a sound in the Animal class");
    }

    public void run() {
        System.out.println("I am running in the Animal class");
    }

    public void sleep() {
        System.out.println("I am sleeping in the Animal class");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", legs=" + legs +
                '}';
    }
}

class WildAnimal extends Animal {
    String location;

    public WildAnimal(String location) {
        super();
        this.location = location;
    }

    public WildAnimal(String species, String eyeColor, int legs, String location) {
        super(species, eyeColor, legs);
        this.location = location;
    }

    @Override
    public void makeSound() {
        System.out.println("I am making a sound in the WildAnimal class");
    }

    @Override
    public void run() {
        System.out.println("I am running in the WildAnimal class");
    }

    @Override
    public void sleep() {
        System.out.println("I am sleeping in the WildAnimal class");
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "species='" + species + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", legs=" + legs +
                ", location='" + location + '\'' +
                '}';
    }
}

class Pet extends Animal {
    String name;

    public Pet(String name) {
        this.name = name;
    }

    public Pet(String species, String eyeColor, int legs, String name) {
        super(species, eyeColor, legs);
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("I am making a sound in the Pet class");
    }

    @Override
    public void run() {
        System.out.println("I am running in the Pet class");
    }

    @Override
    public void sleep() {
        System.out.println("I am sleeping in the Pet class");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class ZooAnimal extends Animal {
    String enclosureType;

    public ZooAnimal(String enclosureType) {
        this.enclosureType = enclosureType;
    }

    public ZooAnimal(String species, String eyeColor, int legs, String enclosureType) {
        super(species, eyeColor, legs);
        this.enclosureType = enclosureType;
    }

    @Override
    public void makeSound() {
        System.out.println("I am making a sound in the ZooAnimal class");
    }

    @Override
    public void run() {
        System.out.println("I am running in the ZooAnimal class");
    }

    @Override
    public void sleep() {
        System.out.println("I am sleeping in the ZooAnimal class");
    }

    public String getEnclosureType() {
        return enclosureType;
    }

    public void setEnclosureType(String enclosureType) {
        this.enclosureType = enclosureType;
    }

    @Override
    public String toString() {
        return "ZooAnimal{" +
                "species='" + species + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", legs=" + legs +
                ", enclosureType='" + enclosureType + '\'' +
                '}';
    }
}


class PetBreed extends Pet {
    String breed;

    public PetBreed(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public PetBreed(String species, String eyeColor, int legs, String name, String breed) {
        super(species, eyeColor, legs, name);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("I am making a sound in the PetBreed class");
    }

    @Override
    public void run() {
        System.out.println("I am running in the PetBreed class");
    }

    @Override
    public void sleep() {
        System.out.println("I am sleeping in the PetBreed class");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "PetBreed{" +
                "species='" + species + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", legs=" + legs +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}


