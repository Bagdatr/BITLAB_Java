package chapter7;
import java.util.Scanner;
public class Task_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        String c = in.next();
        System.out.println(check(a,b,c));

    }
    public static int check(int a,int b,String c){
        int res = 0;
        if(String.valueOf(c).equals("+")){
            res = a + b;
        }else if(String.valueOf(c).equals("-")){
            res = a - b;
        }else if(String.valueOf(c).equals("*")){
            res = a * b;
        }else if(String.valueOf(c).equals("/")){
            res = a / b;
        }return res;
    }
}