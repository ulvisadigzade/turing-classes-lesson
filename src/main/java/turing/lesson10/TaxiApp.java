package turing.lesson10;


public class TaxiApp {
    public static void main(String[] args) {

        // This code was helped by ChatGPT since I’m not really into cars.
        // Just wanted to be honest and clear about that. — Ulvi

        Vehicle genericVehicle = new Vehicle("GenericBrand", "ModelX", "1234XYZ", true);

        Taxi cityTaxi = new Taxi("Toyota", "Camry", "TX5678", true, 4, "CityTaxiCo");
        Bus schoolBus = new Bus("Volvo", "B9R", "BUS2023", false, 50, true);

        Vehicle[] vehicles = {genericVehicle, cityTaxi, schoolBus};

        for (Vehicle vehicle : vehicles) {
            vehicle.drive();
            System.out.println();
            System.out.println(vehicle);
            System.out.println("-------------------------");
        }

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Taxi) {
                Taxi taxi = (Taxi) vehicle;
                System.out.println("Fare for 10 km (day): " + taxi.calculateFare(10));
                System.out.println("Fare for 10 km (night): " + taxi.calculateFare(10, true));
            }
        }

        System.out.println("---------------------------");

        Driver driver = new Driver();
        driver.setAge(27);
        driver.setName("Derrick");
        driver.setLicenseNumber("33-AAA-33");

        System.out.println(driver);
    }
}
