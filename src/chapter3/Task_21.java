package chapter3;

import java.util.Scanner;

public class Task_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 1;
        int sum = 0;

        while(n !=0){
            n = in.nextInt();
            sum += n;
        }
        System.out.print(sum);
    }
}
