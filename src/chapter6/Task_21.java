package chapter6;
import java.util.Scanner;
public class Task_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                str2 = str2 + String.valueOf(str.charAt(i)).toLowerCase();
            } else {
                str2 = str2 + String.valueOf(str.charAt(i)).toUpperCase();
            }
        }
        System.out.println(str2);
    }
}