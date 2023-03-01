package chapter7;
import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(getExist(a,b,c));

    }
    public static String getExist(int a, int b, int c){
        if((a+b>c) && (a+c>b) && (c+b>a)){
            return "YES";
        }else return "NO";
    }
}
