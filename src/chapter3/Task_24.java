package chapter3;

import java.util.Scanner;

public class Task_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int x = 1;
        int c = 2;

        while (c <= n) {
            x = c * x;
            c++;
        }
        System.out.println(x);

    }
}
