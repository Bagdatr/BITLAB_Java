package chapter15_ArrayList_HashSet;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Task_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> nums1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums1.add(in.nextInt());
        }
        int m = in.nextInt();
        ArrayList<Integer> nums2 = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            nums2.add(in.nextInt());
        }
        Collections.sort(nums1);
        Collections.sort(nums2);
        ArrayList<Integer>nums3 = new ArrayList<>(nums1);
        nums3.addAll(nums2);
        Collections.sort(nums3);
        System.out.println("Sorted first array:");
        for(int i:nums1){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Sorted second array:");
        for(int i:nums2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Sorted third array:");
        for(int i:nums3){
            System.out.print(i+" ");
        }
    }
}