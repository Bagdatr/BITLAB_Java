package chapter7;
import java.util.Scanner;
public class Task_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        check(name);
    }
    public static void check(String str){
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            res = res+String.valueOf(str.charAt(i))+String.valueOf(str.charAt(i));
        }
        System.out.print(res);
    }
}