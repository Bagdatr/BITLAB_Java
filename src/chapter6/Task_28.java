package chapter6;
import java.util.Scanner;
public class Task_28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String arr[] = str.split(" ");
        String text = "";

        for(int i=0;i<arr.length;i++){
            for(int j=arr[i].length()-1;j>=0;j--){
                text = text + String.valueOf(arr[i].charAt(j));
                }
            text = text + " ";
            }
        System.out.println(text);
    }
}