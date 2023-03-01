package chapter7;
import java.util.Scanner;
public class Task_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int []array = new int [size];
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(check(array));

    }
    public static int check(int array[]){
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0) {
                    sum += array[i];
                    count++;
            }
        }
        int avg = sum/count;

        return avg;
    }
}