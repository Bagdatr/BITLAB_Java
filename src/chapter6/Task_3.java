package chapter6;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();
        String text2 = "BITLAB";

        if(text.equals(text2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
