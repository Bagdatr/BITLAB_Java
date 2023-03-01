package chapter4;
import java.util.Scanner;
public class Task_25 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);

        int size = in.nextInt();
        int[] nums = new int[size];

        for(int i=0;i<nums.length;i++){
            nums[i] = in.nextInt();
        }
        int m = in.nextInt();
        int x = 0;
        int n = 0;

        for(int i=0;i<nums.length;i++){
            if(m<nums[i]){
                x+=nums[i];
                n++;
            }
        }
        System.out.println((float)x/n);
    }
}
