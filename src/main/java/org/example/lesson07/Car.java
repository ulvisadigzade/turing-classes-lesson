package org.example.lesson07;

public class Car {
    public String model;
    public String brand;
    public String color;
    public String type;
    public String engine;
    public double price;
    public double horsePower;
    public int doors;


    public Car(String model, String brand, String color, String type, String engine, double price, double horsePower, int doors){
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.engine = engine;
        this.price = price;
        this.horsePower = horsePower;
        this.doors = doors;
    }

    @Override
    public String toString(){
        return "Model: %s, Brand: %s, Color: %s, Type: %s, Engine: %s, Price: %f, Horse Power: %f, Door: %d".formatted(
                model, brand, color, type, engine, price, horsePower, doors
        );
    }
}


