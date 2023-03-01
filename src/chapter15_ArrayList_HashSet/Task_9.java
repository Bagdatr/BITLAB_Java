package chapter15_ArrayList_HashSet;
import java.util.Scanner;
import java.util.ArrayList;
public class Task_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        while (true) {
            int x = in.nextInt();
            if (x == 0) break;
            nums.add(x);
        }
        boolean x = true;
        for(int i=1;i<nums.size();i++){
            for(int j=2;j<nums.get(i);j++){
                if(nums.get(i)%j==0){
                    x = false;
                    break;
                }
            }
            if(x==true){
                System.out.print(nums.get(i)+" ");
            }
            x = true;
        }
    }
}