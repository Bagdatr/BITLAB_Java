package chapter4;
import java.util.Scanner;
public class Task_23 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] nums = new int[size];

        for(int i=0;i<nums.length;i++){
            nums[i] = in.nextInt();
        }

        int x = nums[0];
        int y = nums[0];
        int sum = 0;
        int count = 0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            count++;
            if(x<nums[i]){
                x = nums[i];
            }else if(y>nums[i]){
                y = nums[i];
            }
        }
        System.out.println(sum-x-y);
        System.out.println(((float)sum-x-y)/(count-2));
    }
}
