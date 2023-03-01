package chapter6;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        String str1 = in.nextLine();
        String str2 = in.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.equals(str2)){
            System.out.println("THEY ARE EQUAL");
        }else{
            System.out.println("THEY ARE NOT EQUAL");
        }
    }
}
