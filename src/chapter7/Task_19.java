package chapter7;
import java.util.Scanner;
public class Task_19 {
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
        for (int i = 0; i < array.length; i++) {
            if(array[i]<50 && array[i]%5==0){
                System.out.println(array[i]+ " ");
            }
        }
    }
}