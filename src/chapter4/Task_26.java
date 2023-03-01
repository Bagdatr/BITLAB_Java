package chapter4;
import java.util.Scanner;

public class Task_26 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] nums = new int[size];

        for(int i=0;i<nums.length;i++){
            nums[i] = in.nextInt();
        }

        int n = size - 1;

        for(int i=n;i>=0;i--){
            System.out.print(nums[i]+" ");
        }
    }
}
