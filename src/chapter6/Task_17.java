package chapter6;
import java.util.Scanner;
public class Task_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        int count = 0;
        String s12 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            s12 += s1.charAt(i);
        }
        if(s12.equals(s2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}