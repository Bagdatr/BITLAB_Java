package chapter9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Phone[] phones = new Phone[10];
        for (int i = 0; i < 3; i++) {
            phones[i] = new Phone();
            phones[i].name = in.next();
            phones[i].model = in.next();
            phones[i].price = in.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            if (phones[i].getCategory() == "TOP" || phones[i].getCategory() == "SIMPLE") {
                System.out.println(phones[i].toString());

            }
        }
//                System.out.println("I want to buy a new "+phones[i].name+" "+phones[i].model+" for "+phones[i].price+" dollar. The category of this phone is "+phones[i].getCategory());
    }
}
