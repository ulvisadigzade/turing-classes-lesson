package turing.lesson11;

public class Car extends Vehicle {
    private int seatCount;

    public Car(String brand, String model, int year, int seatCount) {
        super(brand, model, year);
        this.seatCount = seatCount;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public void drive() {
        System.out.printf("Driving a %s passenger car", getBrand());
    }

    @Override
    public String getType() {
        return "Car";
    }

    @Override
    public String toString(){
        return super.toString() + ", seat count: " + seatCount;
    }
}
