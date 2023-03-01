package chapter7;
import java.util.Scanner;
public class Task_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        System.out.println(check(word));
    }
    public static int check(String s1){
        String vow[] = {"a", "e", "i", "o", "u"};
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < vow.length; j++) {
                if(String.valueOf(s1.charAt(i)).equalsIgnoreCase(vow[j])){
                    count++;
                }
            }
        }
        return count;
    }
}