package chapter5;

import java.util.Scanner;

public class Task_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = n;
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int tmp[] = arr[0];
        arr[0] = arr[n - 1];
        arr[n - 1] = tmp;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
                ;
            }
            System.out.println();
        }
    }
}