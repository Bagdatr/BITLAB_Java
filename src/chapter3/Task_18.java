package chapter3;

import java.util.Scanner;

public class Task_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int i = 0;
        int k = 3;
        int sum = 0;

        while (i < n) {
            sum = sum + k;
            k = k + 3;
            i++;
        }
        System.out.print(sum);
    }
}