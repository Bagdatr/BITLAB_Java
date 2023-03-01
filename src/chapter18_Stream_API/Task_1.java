package chapter18_Stream_API;
import java.util.ArrayList;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int input = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        int counter = 1;
        while(counter<=input){
            nums.add(in.nextInt());
            counter++;
        }
        nums.stream().filter(n->n%2==0).forEach(e->System.out.print(e+" "));
    }
}