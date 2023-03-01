package chapter7;
import java.util.Scanner;
public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1 = in.nextLine();
        String s2 = in.nextLine();
        contains(s1,s2);
    }
    public static void contains(String str1, String str2) {
        if (str1.contains(str2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
