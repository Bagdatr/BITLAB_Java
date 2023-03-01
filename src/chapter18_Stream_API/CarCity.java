package chapter18_Stream_API;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.stream.Collectors;
public class CarCity {
    ArrayList<Car> cars = new ArrayList<>();

    public CarCity(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }
    public Car firstGreatVolumeCar(){
        return cars.stream().filter(elem -> elem.engineVolume > 3.0).findFirst().get();
    }

    ArrayList<Car> search(String name) {
        return new ArrayList<Car>(cars.stream().filter(elem -> elem.getName().equals(name)).collect(Collectors.toList()));
    }

    ArrayList<Car>filterCars(int fromSpeed, int toSpeed, double fromVolume, double toVolume){
        return new ArrayList<Car>(cars.stream().filter(elem -> elem.getMaxSpeed() >= fromSpeed && elem.getMaxSpeed() <= toSpeed && elem.getEngineVolume() >= fromVolume && elem.getEngineVolume() <= toVolume).collect(Collectors.toList()));
    }
}