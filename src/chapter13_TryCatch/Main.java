package chapter13_TryCatch;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int num,denum,result = 0;
        try{
            num = in.nextInt();
            denum = in.nextInt();
            result = num/denum;
        }catch (InputMismatchException input){
            System.out.println("Enter number");
        }catch (ArithmeticException ar){
            System.out.println("Na nol delit nelzya");
        }
        System.out.println(result);
    }
}
