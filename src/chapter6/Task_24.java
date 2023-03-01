package chapter6;
import java.util.Scanner;
public class Task_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String arr[] = str.split(" ");
        String str1 = "";

        for (int i = 0; i < arr.length; i++) {
            for (int j=0; j<1;j++){
                str1 = str1 + String.valueOf(arr[i].charAt(0)).toUpperCase();
            }
            for(int y=1; y<arr[i].length();y++){
                str1 = str1 + arr[i].charAt(y);
            }
            str1 = str1 + " ";
        }
        System.out.println(str1);
    }
}