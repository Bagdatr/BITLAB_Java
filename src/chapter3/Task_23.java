package chapter3;

import java.util.Scanner;

public class Task_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 1;
        int x = 0;

        while(n !=0){
            n = in.nextInt();
            if (n>x){
                x = n;

             }
         }
        System.out.print(x);
    }

}
