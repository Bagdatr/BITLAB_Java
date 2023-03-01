package chapter15_ArrayList_HashSet;
import java.util.Scanner;
import java.util.HashSet;
public class Task_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;
        HashSet<Integer> nums = new HashSet<>();

        for (int i = 0; i < n; i++) {
            nums.add(in.nextInt());
        }
        int sum = 0;
        for (int i : nums) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
