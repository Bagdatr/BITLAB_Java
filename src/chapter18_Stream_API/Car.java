package chapter18_Stream_API;
import java.util.Collections;
import java.util.stream.Collectors;

public class Car {
    String name;
    int maxSpeed;
    double engineVolume;

    public Car() {
        this.name = "No name";
        this.maxSpeed = 0;
        this.engineVolume = 0.0;
    }

    public Car(String name, int maxSpeed, double engineVolume) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.engineVolume = engineVolume;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
}
