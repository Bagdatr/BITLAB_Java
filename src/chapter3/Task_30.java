package chapter3;

import java.util.Scanner;

public class Task_30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt(); int n = in.nextInt(); int w = in.nextInt();
        int sum = 0;
        int c = 1;

        while (c <= w) {
            sum = sum + c*k;
            c++;
        }
        System.out.print(sum = sum - n);
    }
}