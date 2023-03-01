package chapter6;
import java.util.Scanner;
public class Task_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int count = 0;

        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}