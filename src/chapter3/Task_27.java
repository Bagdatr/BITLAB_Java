package chapter3;

import java.util.Scanner;

public class Task_27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        double sum = 1;
        int count = 1;

        while (count < n) {
            count++;
            sum = sum + (1.0/count);
            }
        System.out.print(sum);
        }
    }
