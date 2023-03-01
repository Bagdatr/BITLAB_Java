package chapter7;
import java.util.Scanner;
public class Task_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int []nums = new int [n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        check(nums);
    }
    public static void check(int[] array){
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(max<array[i]){
                max = array[i];
            }else if(min>array[i]){
                min = array[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}