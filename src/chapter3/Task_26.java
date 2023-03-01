package chapter3;

import java.util.Scanner;

public class Task_26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 1;
        int sum = -1;

        while (n != 0) {
            if (n%2 != 0) {
                sum = sum + n;
            }
            n = in.nextInt();
        }
        System.out.print(sum);
    }
}
