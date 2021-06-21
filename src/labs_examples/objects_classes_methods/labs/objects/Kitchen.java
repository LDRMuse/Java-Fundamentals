package labs_examples.objects_classes_methods.labs.objects;

public class Kitchen {

    Oven oven;
    Dishwasher dishwasher;
    Refrigerator fridge;
    Sink sink;

    public Kitchen(Oven oven, Dishwasher dishwasher, Refrigerator fridge, Sink sink) {
        this.oven = oven;
        this.dishwasher = dishwasher;
        this.fridge = fridge;
        this.sink = sink;
    }

    public Oven getOven() {
        return oven;
    }

    public void setOven(Oven oven) {
        this.oven = oven;
    }

    public Dishwasher getDishwasher() {
        return dishwasher;
    }

    public void setDishwasher(Dishwasher dishwasher) {
        this.dishwasher = dishwasher;
    }

    public Refrigerator getFridge() {
        return fridge;
    }

    public void setFridge(Refrigerator fridge) {
        this.fridge = fridge;
    }

    public Sink getSink() {
        return sink;
    }

    public void setSink(Sink sink) {
        this.sink = sink;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "oven=" + oven +
                ", dishwasher=" + dishwasher +
                ", fridge=" + fridge +
                ", sink=" + sink +
                '}';
    }
}

 class Oven {
    boolean isEnergyEfficient;
    int temperature;
    String brand;

     public boolean isEnergyEfficient() {
         return isEnergyEfficient;
     }

     public void setEnergyEfficient(boolean energyEfficient) {
         isEnergyEfficient = energyEfficient;
     }

     public int getTemperature() {
         return temperature;
     }

     public void setTemperature(int temperature) {
         this.temperature = temperature;
     }

     public String getBrand() {
         return brand;
     }

     public void setBrand(String brand) {
         this.brand = brand;
     }

     public Oven(boolean isEnergyEfficient, int temperature, String brand) {
         this.isEnergyEfficient = isEnergyEfficient;
         this.temperature = temperature;
         this.brand = brand;

     }

     @Override
     public String toString() {
         return "Oven{" +
                 "isEnergyEfficient=" + isEnergyEfficient +
                 ", temperature=" + temperature +
                 ", brand='" + brand + '\'' +
                 '}';
     }
 }

class Refrigerator{
    boolean isDoubleWide;
    String brand;

    public Refrigerator(boolean isDoubleWide, String brand) {
        this.isDoubleWide = isDoubleWide;
        this.brand = brand;
    }

    public boolean isDoubleWide() {
        return isDoubleWide;
    }

    public void setDoubleWide(boolean doubleWide) {
        isDoubleWide = doubleWide;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "isDoubleWide=" + isDoubleWide +
                ", brand='" + brand + '\'' +
                '}';
    }
}

class Sink {
    boolean hasGarbageDisposal;
    boolean isDual;
    String brand;

    public Sink(boolean hasGarbageDisposal, boolean isDual, String brand) {
        this.hasGarbageDisposal = hasGarbageDisposal;
        this.isDual = isDual;
        this.brand = brand;
    }

    public boolean isHasGarbageDisposal() {
        return hasGarbageDisposal;
    }

    public void setHasGarbageDisposal(boolean hasGarbageDisposal) {
        this.hasGarbageDisposal = hasGarbageDisposal;
    }

    public boolean isDual() {
        return isDual;
    }

    public void setDual(boolean dual) {
        isDual = dual;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Sink{" +
                "hasGarbageDisposal=" + hasGarbageDisposal +
                ", isDual=" + isDual +
                ", brand='" + brand + '\'' +
                '}';
    }
}

class Dishwasher {
    boolean isEnergyEfficient;
    String brand;
    int yearsOld;

    public Dishwasher(boolean isEnergyEfficient, String brand, int yearsOld) {
        this.isEnergyEfficient = isEnergyEfficient;
        this.brand = brand;
        this.yearsOld = yearsOld;
    }

    public boolean isEnergyEfficient() {
        return isEnergyEfficient;
    }

    public void setEnergyEfficient(boolean energyEfficient) {
        isEnergyEfficient = energyEfficient;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    @Override
    public String toString() {
        return "Dishwasher{" +
                "isEnergyEfficient=" + isEnergyEfficient +
                ", brand='" + brand + '\'' +
                ", yearsOld=" + yearsOld +
                '}';
    }
}
