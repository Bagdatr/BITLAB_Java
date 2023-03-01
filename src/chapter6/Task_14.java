package chapter6;
import java.util.Scanner;
public class Task_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        if(s1.contains(s2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}