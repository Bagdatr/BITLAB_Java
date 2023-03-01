package chapter13_TryCatch_Tasks;
import java.util.Scanner;
public class Main_Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            try {
                nums[i] = Integer.parseInt(in.next());
            } catch (Exception e) {
                nums[i] = 0;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] * nums[i] + " ");
        }
    }
}