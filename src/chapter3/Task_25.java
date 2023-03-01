package chapter3;

import java.util.Scanner;

public class Task_25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double d = 1.0;
        double x = 1.0;

        while (d != 0) {
            x = x*d;
            d = in.nextDouble();
        }
            System.out.print(x);
        }
    }
