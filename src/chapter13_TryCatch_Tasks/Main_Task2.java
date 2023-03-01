package chapter13_TryCatch_Tasks;
import java.util.Scanner;
public class Main_Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,result = 0;
        try{
            a = in.nextInt();
            b = in.nextInt();
            result = a/b;
            System.out.println(result);
        }catch(ArithmeticException ar) {
            System.out.println("Division by zero");
        }
    }
}
