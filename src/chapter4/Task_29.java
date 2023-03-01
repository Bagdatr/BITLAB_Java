package chapter4;
import java.util.Scanner;

public class Task_29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();             //создал массив-1
        }
        int n = 0;                              //создал счетчик массива-2

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                n++;                            //узнал кол-во нулевых элементов в массиве-1
            }
        }
        int[] nums2 = new int[n];               //создал массив-2
        int a = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                nums2[a] = i;
                a++;                             //номера индексов нулевых элементов массива-1 сделал элементами массива-2
            }
        }
        int sum = 0;                            //добавил переменную суммы

        for (int i = nums2[0]; i < nums2[1]; i++) {
            sum += nums[i];
        }
        System.out.println(sum);
    }
}