package chapter7;
import java.util.Scanner;
public class Task_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int []arr = new int [size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(check(arr));
    }
    public static int check(int[]array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=0){
                count++;
            }
        }
        return count;
    }
}
