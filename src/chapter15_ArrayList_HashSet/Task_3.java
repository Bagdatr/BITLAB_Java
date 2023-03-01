package chapter15_ArrayList_HashSet;
import java.util.Scanner;
import java.util.ArrayList;
public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(in.nextInt());
        }

        int firstMax = 0;
        int secondMax = 0;
        for (Integer e: nums) {
            if(firstMax<e){
                secondMax = firstMax;
                firstMax = e;
            }
        }
        System.out.println(secondMax);
    }
}

//
//        int max = 0;
//        int maxIndex = 0;
//        for (int i = 0; i < nums.size(); i++) {
//            if (max < nums.get(i)) {
//                max = nums.get(i);
//                maxIndex = i;
//            }
//        }
//        nums.remove(maxIndex);
//
//        int max2 = 0;
//        for (int i = 0; i < nums.size(); i++) {
//            if (max2 < nums.get(i)) {
//                max2 = nums.get(i);
//            }
//        }
//        System.out.println(max2);
//    }
//}
