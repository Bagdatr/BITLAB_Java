package chapter3;

import java.util.Scanner;

public class Task_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 1;
        double sum = 0;
        int count = -1;

        while (n != 0) {
            n = in.nextInt();
            sum += n;
            count++;
        }
        if (sum%count == 0) {
            System.out.print((int)sum/count);
        } else if (sum%count != 0){
            System.out.print(sum/count);
        }
    }
}
