package chapter6;
import java.util.Scanner;
public class Task_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String chr = in.next();
        int sum = 0;

        for(int i=0;i<str.length();i++){
            if(String.valueOf(str.charAt(i)).equalsIgnoreCase(chr)){
                sum++;
            }
        }
        System.out.println(sum);
    }
}