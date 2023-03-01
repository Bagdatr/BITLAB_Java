package chapter4;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] nums = new int[size];

        for (int i=0;i<nums.length;i++){
            nums[i] = in.nextInt();
        }
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}

