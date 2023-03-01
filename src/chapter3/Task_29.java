package chapter3;

import java.util.Scanner;

public class Task_29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int x = 1;
        int d = 0;

        while (x <= n) {
            d = d + (x*x);
            x++;
            }
        System.out.print(d);
        }
    }
