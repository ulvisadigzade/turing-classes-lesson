package turing.lesson07;

public class Moto {
    public String model;
    public String color;
    public String brand;
    public int year;
    public String engine;
    public String fuel;
    public String transmission;
    public double price;
    public double hoursePower;
    public String gear;

    public Moto(String model, String color, String brand, int year, String engine, String fuel, String transmission, double price, double hoursePower, String gear) {
        this.model = model;
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.engine = engine;
        this.fuel = fuel;
        this.transmission = transmission;
        this.price = price;
        this.hoursePower = hoursePower;
        this.gear = gear;
    }

    public String toString() {
        return "Model: " + model + "\nColor: " + color + "\nBrand: " + brand + "\nYear: " + year + "\nEngine: " + engine + "\nFuel: " + fuel + "\nTransmission: " + transmission + "\nPrice: " + price + "\nHoursePower: " + hoursePower + "\nGear: " + gear;
    }
}
