package chapter4;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] nums = new int[size];
        int n = 0;

        for(int i=0;i<nums.length;i++){
            nums[i] = in.nextInt();
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                n++;
            }
        }

        System.out.print(n);
    }
}
