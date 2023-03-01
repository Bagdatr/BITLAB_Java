package chapter7;
import java.util.Scanner;
public class Task_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        check(arr);
    }

    public static void check(int[] array) {
        int x = 1;
        for (int i = 0; i < array.length; i++) {
            x = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i!=j) {
                    x = 0;
                    break;
                }
            }
            if(x==1){
                System.out.print(array[i] + " ");
            }
        }
    }
}