package chapter15_ArrayList_HashSet;
import java.util.Scanner;
import java.util.ArrayList;
public class Task_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();
        while (true) {
            int x = in.nextInt();
            if (x == 0) break;
            nums.add(x);
        }
        int min = -1;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < 0) {
                nums2.add(nums.get(i));
                System.out.print(nums.get(i) + " ");
                if (min > nums.get(i)) {
                    min = nums.get(i);
                }
            }
        }
        int max = min;
        for(Integer e:nums2){
            if(max<e){
                max=e;
            }
        }
        System.out.println();
        System.out.println(max);
    }
}