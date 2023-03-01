package chapter6;
import java.util.Scanner;
public class Task_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String opr = in.next();
        int y = in.nextInt();
        int res = 0;
        if(String.valueOf(opr).equals("+")){
            res = x + y;
        }else if(String.valueOf(opr).equals("-")){
            res = x - y;
        }else if(String.valueOf(opr).equals("*")){
            res = x * y;
        }else if(String.valueOf(opr).equals("/")){
            res = x / y;
        }
        System.out.println(res);
    }
}