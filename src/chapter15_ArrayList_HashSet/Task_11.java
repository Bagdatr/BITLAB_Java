package chapter15_ArrayList_HashSet;
import java.util.Scanner;
import java.util.HashSet;
import java.util.*;
public class Task_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 10;
        HashSet<String> names = new HashSet<>();
        for (int i=0;i< n;i++) {
            names.add(in.next());
        }
        System.out.println(names.size());
    }
}
