package chapter16_Map_HashMap;

import java.util.Scanner;
import java.util.HashMap;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> cars = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            cars.put(in.next(), in.nextInt());
        }
        for (String key : cars.keySet()) {
            System.out.println(key + " costs " + cars.get(key) + " USD");
        }
    }
}
