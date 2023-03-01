package chapter15_ArrayList_HashSet;
import java.util.Scanner;
import java.util.ArrayList;
public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        int r = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(in.nextInt());
        }
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            if(i>=l && i<=r){
                sum = sum+nums.get(i);
            }
        }
        System.out.println(sum);
    }
}
