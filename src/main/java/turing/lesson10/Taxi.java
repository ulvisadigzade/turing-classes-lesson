package turing.lesson10;

public class Taxi extends Vehicle {
    private int passengerCount;
    private String taxiCompany;

    public Taxi(String brand, String model, String plateNumber, boolean isAvailable, int passengerCount, String taxiCompany) {
        super(brand, model, plateNumber, isAvailable);
        this.passengerCount = passengerCount;
        this.taxiCompany = taxiCompany;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public String getTaxiCompany() {
        return taxiCompany;
    }

    public void setTaxiCompany(String taxiCompany) {
        this.taxiCompany = taxiCompany;
    }

    double calculateFare(int km){
        return 10.30 * km;
    }

    double calculateFare(int km, boolean nighShift){
        return (nighShift ? 14.30 + 0.5 : 14.30) * km;
    }

    @Override
    public void drive() {
        System.out.printf("Taxi from %s is driving with %d passengers.", taxiCompany, passengerCount);
    }

    @Override
    public String toString() {
        return super.toString() + " | " +
                "passengerCount=" + passengerCount + " | " +
                "taxiCompany=" + taxiCompany;
    }
}
