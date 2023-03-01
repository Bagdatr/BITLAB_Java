package chapter4;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] nums = new int[size];
        int sum = 0;
        float c = 0;

        for(int i=0;i<nums.length;i++){
            nums[i] = in.nextInt();
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                sum += nums[i];
                c++;
            }
        }

        System.out.println(sum/c);
    }
}
