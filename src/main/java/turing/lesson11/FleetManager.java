package turing.lesson11;

public class FleetManager {
    private Vehicle[] vehicles;
    private int count;

    public FleetManager(int capacity) {
        this.vehicles = new Vehicle[capacity];
        this.count = 0;
    }

    public boolean addVehicle(Vehicle v) {
        if (count >= vehicles.length) return false;
        vehicles[count++] = v;
        return true;
    }

    public void listAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(vehicles[i] + " | Type: " + vehicles[i].getType());
            if (vehicles[i] instanceof Car) ((Car) vehicles[i]).drive();
            else ((Truck) vehicles[i]).haul();
            System.out.println("\n---------");
        }
    }

    public Vehicle[] findByType(String type) {
        int typeCount = 0;
        for (int i = 0; i < count; i++) {
            typeCount += type.equals(vehicles[i].getType()) ? 1 : 0;
        }
        Vehicle[] vehiclesByType = new Vehicle[typeCount];
        int index = 0;

        for (int i = 0; i < count; i++) {
            if (type.equals(vehicles[i].getType())) {
                vehiclesByType[index++] = vehicles[i];
            }
        }
        return vehiclesByType;
    }
}
