package chapter4;
import java.util.Scanner;

public class Task_30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int minusNum = 0;
        int plusNum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                minusNum++;
            }
            if (nums[i] > 0) {
                plusNum++;
            }
        }

        if (minusNum - plusNum == 1 || minusNum == plusNum || plusNum - minusNum == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}