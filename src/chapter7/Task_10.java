package chapter7;
import java.util.Scanner;
public class Task_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println(check(nums));
    }
    public static int check(int array[]){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%5!=0){
                sum+=array[i];
            }
        }
        return sum;
    }
}