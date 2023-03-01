package chapter7;
import java.util.Scanner;
public class Task_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nums[][] = new int [n][n];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = in.nextInt();
            }
        }
        check(nums);
    }
    public static void check(int array[][]){
        int tmp[] = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}