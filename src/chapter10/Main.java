package chapter10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        Toyota t1 = new Toyota();
        Toyota t2 = new Toyota();
        Mercedes m1 = new Mercedes();
        Mercedes m2 = new Mercedes();
        Car c1 = new Car();
        Car c2 = new Car();

        Car[] cars = {t1, t2, m1, m2, c1, c2};

        cars[0] = new Toyota(in.next(), in.next(), in.nextInt(), in.nextInt(), in.nextDouble(), in.next());
        cars[1] = new Toyota(in.next(), in.next(), in.nextInt(), in.nextInt(), in.nextDouble(), in.next());
        cars[2] = new Mercedes(in.next(), in.next(), in.nextInt(), in.nextInt(), in.nextDouble(), in.next());
        cars[3] = new Mercedes(in.next(), in.next(), in.nextInt(), in.nextInt(), in.nextDouble(), in.next());
        cars[4] = new Car(in.next(), in.next(), in.nextInt(), in.nextInt(), in.nextDouble());
        cars[5] = new Car(in.next(), in.next(), in.nextInt(), in.nextInt(), in.nextDouble());

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].ride());
        }
    }
}
