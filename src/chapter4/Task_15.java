package chapter4;

import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] nums = new int[size];
        int sum = 1;

        for(int i=0;i<nums.length;i++){
            nums[i] = in.nextInt();
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                sum = sum*nums[i];
                }
            }
        System.out.println(sum);
        }
    }