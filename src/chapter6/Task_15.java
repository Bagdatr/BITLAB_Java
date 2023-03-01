package chapter6;
import java.util.Scanner;
public class Task_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str = str.toLowerCase();
        String chr[] = {"a", "e", "i", "o", "u"};
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < chr.length; j++) {
                if (String.valueOf(str.charAt(i)).equals(chr[j])) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}

