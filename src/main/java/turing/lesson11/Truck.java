package turing.lesson11;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String brand, String mode, int year, double loadCapacity) {
        super(brand, mode, year);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void haul() {
        System.out.printf("Hauling with a %s truck. Capacity: %f tons.", getBrand(), loadCapacity);
    }

    @Override
    public String getType() {
        return "Truck";
    }

    @Override
    public String toString(){
        return super.toString() + ", load capacity in tons: " + loadCapacity;
    }
}
