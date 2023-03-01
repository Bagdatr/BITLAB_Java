package chapter6;
import java.util.Scanner;
public class Task_22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                str2 = str2 + "0";
            } else {
                str2 = str2 + str.charAt(i);
            }
        }
        System.out.println(str2);
    }
}