package chapter6;
import java.util.Scanner;
public class Task_26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str1 = str.toLowerCase();
        String arr[] = str1.split(" ");
        String num[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String newstr = "";

        for (int i = 0; i < arr.length; i++) {
            boolean x = false;
            for (int j = 0; j < num.length; j++) {
                if (arr[i].equals(num[j])) {
                    newstr = newstr + j;
                    x = true;
                }
            }
            if(!x){
                newstr = newstr + arr[i];
            }
            newstr = newstr + " ";
        }
        System.out.println(newstr);
    }
}