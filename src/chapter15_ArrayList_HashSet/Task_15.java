package chapter15_ArrayList_HashSet;

import java.util.Scanner;
import java.util.HashSet;

public class Task_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> names = new HashSet<>();
        while (true) {
            String x = in.next();
            if (x.equals("stop")) break;
            names.add(x);
        }
        int sum = 0;
        for (String e : names) {
            sum = sum + e.length();
        }
        System.out.println(sum);
    }
}