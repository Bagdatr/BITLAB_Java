package chapter8.Phone;

import chapter8.Phone.Phone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Phone[] phones = new Phone[3];
        for (int i = 0; i < phones.length; i++) {
            phones[i] = new Phone();
            phones[i].name = in.next();
            phones[i].model = in.next();
            phones[i].price = in.nextInt();
        }
        for (int i = 0; i < phones.length; i++) {
            System.out.println(phones[i].getData());
        }
    }
}