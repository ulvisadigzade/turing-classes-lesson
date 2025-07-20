package turing.lesson11;

public class FleetManagementApp {
    public static void main(String[] args) {
        FleetManager fm = new FleetManager(5);

        Car ford = new Car("Ford", "Focus", 2017, 5);
        Car bmw = new Car("BMW", "3 Series", 2021, 4);

        Truck mercedes = new Truck("Mercedes", "Actros", 2015, 18.0);
        Truck man = new Truck("MAN", "TGX", 2020, 20.0);

        fm.addVehicle(ford);
        fm.addVehicle(bmw);
        fm.addVehicle(mercedes);
        fm.addVehicle(man);

        fm.listAll();

        Vehicle[] cars = fm.findByType("Car");
        Vehicle[] trucks = fm.findByType("Truck");

        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
        }
        System.out.print("---------\n");
        for(int i=0;i<trucks.length;i++){
            System.out.println(trucks[i]);
        }
    }
}
