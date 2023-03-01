package chapter4;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] nums = new int[size]; // так мы создали массив из кол-во ячеек, которое определил пользователь

        for (int i=0;i<nums.length;i++){
            nums [i] = in.nextInt();
        }                       // теперь пользователь может вводить данные в ячейки, а массив будет это запоминать

        for (int i=0;i<nums.length;i++){
            System.out.println(i + " - " + nums[i]);
        }                           // теперь программа будет выводить данные ячеек из массива с номером ячейки

    }
}