package chapter7;
import java.util.Scanner;
public class Task_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [][]nums = new int [n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = in.nextInt();
            }
        }
        check(nums);
    }
    public static void check(int[][]array){
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(max<array[i][j]){
                    max = array[i][j];
                }
            }
            System.out.println(max);
            max = 0;
        }
    }
}