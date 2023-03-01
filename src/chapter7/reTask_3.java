package chapter7;
import java.util.Scanner;
public class reTask_3 {
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);

        String a = in.nextLine();
        String b = in.nextLine();
        System.out.println(num(a,b));
    }
    public static int num(String n, String m){
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            if(String.valueOf(n.charAt(i)).equalsIgnoreCase(m)){
                count++;
            }
        }
        return count;
    }
}
