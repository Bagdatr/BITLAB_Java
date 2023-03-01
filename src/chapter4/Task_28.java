package chapter4;
import java.util.Scanner;

public class Task_28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int size2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                size2++;
            }
        }
        int[] nums2 = new int[size2];

        int x = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums2[x] = nums[i];
                System.out.print(nums2[x] + " ");
                x++;
            }
        }
    }
}