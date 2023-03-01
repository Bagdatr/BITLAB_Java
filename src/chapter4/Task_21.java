package chapter4;

import java.util.Scanner;
public class Task_21 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] nums = new int[size];

        for(int i=0;i<nums.length;i++){
            nums[i] = in.nextInt();
        }
        int x = nums[0];
        int y = nums[0];

        for(int i=0;i<nums.length;i++){
            if(x<nums[i]){
                x = nums[i];
            }else if(y>nums[i]) {
                y = nums[i];
            }
        }
        System.out.println(y+" "+x);
    }
}
