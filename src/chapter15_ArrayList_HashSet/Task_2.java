package chapter15_ArrayList_HashSet;

import java.util.Scanner;
import java.util.ArrayList;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        double sum = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(in.nextInt());
            sum = sum + nums.get(i);
        }
        System.out.println(sum / nums.size());
    }
}
