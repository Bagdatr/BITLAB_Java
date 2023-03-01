package chapter6;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();
        text = text.toLowerCase();
        String text2 = "java";

        if(text.equals(text2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
