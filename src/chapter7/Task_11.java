package chapter7;
import java.util.Scanner;
public class Task_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println(check(n));
    }
    public static String check(int num){
        if(num%2==0){
            return "YES";
        }else return "NO";
    }
}