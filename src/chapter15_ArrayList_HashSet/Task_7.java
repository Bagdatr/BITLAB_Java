package chapter15_ArrayList_HashSet;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Task_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        while(true){
            int x = in.nextInt();
            if(x==0) break;
            nums.add(x);
        }
        LinkedHashSet<Integer> nonUniq = new LinkedHashSet<>();
        HashSet<Integer> uniq = new HashSet<>();
        for(Integer d: nums){
            if(uniq.contains(d)){
                nonUniq.add(d);
            }else{
                uniq.add(d);
            }
        }
        for(Integer d:nonUniq){
            System.out.print(d+" ");
        }

    }
}
