package chapter4;

import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] nums = new int[size];
        int x = 1;

        for(int i=0;i<nums.length;i++){
            nums[i] = in.nextInt();
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0 && i%2==0){
                x = x*nums[i];
            }
        }
        System.out.println(x);
    }
}
