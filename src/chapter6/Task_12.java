package chapter6;
import java.util.Scanner;
public class Task_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String a = "a";
        String o = "o";
        for(int i=0;i<str.length();i++){
            if(String.valueOf(str.charAt(i)).equalsIgnoreCase(a)){
                str = str.replace(String.valueOf(str.charAt(i)),o);
            }
        }
        System.out.println(str);
    }
}