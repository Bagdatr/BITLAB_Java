package chapter6;
import java.util.Scanner;
public class Task_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int sum = 0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                sum = sum + Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println(sum);
    }
}