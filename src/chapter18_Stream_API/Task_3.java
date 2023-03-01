package chapter18_Stream_API;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.*;
public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(in.nextInt());
        }
        System.out.println(nums.stream().reduce(0, (sum, x) -> sum + x));
    }
}
