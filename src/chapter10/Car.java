package chapter10;

public class Car {
    String name;
    String model;
    int maxSpeed;
    int year;
    double volume;

    public Car() {
        this.name = "No name";
        this.model = "No model";
        this.maxSpeed = 0;
        this.year = 0;
        this.volume = 0.0;
    }

    public Car(String name, String model, int maxSpeed, int year, double volume) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.volume = volume;
    }

    public String ride() {
        return "Car " + name + " " + model + " with max speed " + maxSpeed + " km/h from " + year + " year with engine volume " + volume + " liters is riding.";
    }
}
