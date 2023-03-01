package chapter6;
import java.util.Scanner;
public class Task_25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String arr[] = str.split(" ");
        String str1 = "";
        String index1 = "<";

        for(int i=0;i<arr.length;i++){
            if(String.valueOf(arr[i]).equals(index1)){
                for(int j=0;j<arr[i+1].length();j++){
                    str1 = str1 + arr[i+1].charAt(j);
                }
                str1 = str1 + " ";
            }
        }
        System.out.print(str1);
    }
}

