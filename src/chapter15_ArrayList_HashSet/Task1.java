package chapter15_ArrayList_HashSet;
import java.util.Scanner;
import java.util.ArrayList;
public class Task1 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            nums.add(in.nextInt());
        }
        for (Integer elem: nums) {
            System.out.print(elem/2 +" ");
        }
    }
}
