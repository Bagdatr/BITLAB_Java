package chapter15_ArrayList_HashSet;
import java.util.Scanner;
import java.util.HashSet;
public class Task_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> nums = new HashSet<>();
        while (true) {
            int x = in.nextInt();
            if (x == 0) break;
            nums.add(x);
        }
        if (nums.contains(77)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
