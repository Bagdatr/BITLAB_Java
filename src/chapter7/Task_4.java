package chapter7;
import java.util.Scanner;
public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println(palindrome(name));
    }

    public static String palindrome(String str) {
        String eman = "";
        for (int i = str.length()-1; i >= 0; i--) {
            eman = eman + str.charAt(i);
        }
        if (eman.equals(str)) {
            return "YES";
        } else return "NO";
    }
}