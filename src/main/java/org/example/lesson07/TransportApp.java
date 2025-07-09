package org.example.lesson07;

public class TransportApp {
    public static void main(String[] args) {
        Car car1 = new Car("Model S", "Tesla", "Red", "Sedan", "Electric", 79999.99, 670, 4);
        Car car2 = new Car("Mustang", "Ford", "Blue", "Coupe", "V8", 55999.50, 450, 2);

        Moto moto1 = new Moto("Ninja ZX-6R", "Green", "Kawasaki", 2023, "636cc", "Gasoline", "Manual", 9999.99, 130, "6-speed");
        Moto moto2 = new Moto("CBR500R", "Red", "Honda", 2022, "471cc", "Gasoline", "Manual", 6799.00, 47, "6-speed");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(moto1);
        System.out.println(moto2);
    }
}
