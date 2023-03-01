package chapter15_ArrayList_HashSet;

import java.util.Scanner;
import java.util.ArrayList;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(in.nextInt());
        }
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
