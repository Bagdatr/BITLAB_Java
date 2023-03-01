package chapter6;
import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        String[] numbers = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0;i<numbers.length;i++){
            if(numbers[i].equals(str)){
                System.out.println(i);
            }
        }
    }
}