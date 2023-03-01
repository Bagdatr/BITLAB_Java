package chapter7;
import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String letter = in.nextLine();
        System.out.println(check(str,letter));
    }
    public static int check(String str, String letter){
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if(String.valueOf(str.charAt(i)).equals(String.valueOf(letter))){
                count++;
            }
        }
        return count;
    }
}

