package chapter4;
import java.util.Scanner;

public class Task_27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int max = nums[0];
        int nmax = 0;
        int min = nums[0];
        int nmin = 0;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                nmax = i;
                max = nums[i];
            }else if (min > nums[i]) {
                nmin = i;
                min = nums[i];
            }
        }
        int x = nums[nmin];
        nums[nmin] = nums[nmax];
        nums[nmax] = x;

        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
    }
}