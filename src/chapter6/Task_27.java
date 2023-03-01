package chapter6;
import java.util.Scanner;
public class Task_27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String arr[] = str.split(" ");
        int brr[] = new int [6];
        String oper[] = {"+", "-", "*", "/"};
        int res = 0;

//      0 2 4 = цифры
//      1 3 = операторы

        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i].charAt(0))) {
                brr[i] =  Integer.parseInt(arr[i]);
            }
        }

        if(arr[1].equals(oper[0]) && arr[3].equals(oper[0])){
            res = brr[0] + brr[2] + brr[4];
        }else if(arr[1].equals(oper[0]) && arr[3].equals(oper[1])){
            res = brr[0] + brr[2] - brr[4];
        }else if(arr[1].equals(oper[1]) && arr[3].equals(oper[0])){
            res = brr[0] - brr[2] + brr[4];
        }else if(arr[1].equals(oper[1]) && arr[3].equals(oper[1])){
            res = brr[0] - brr[2] - brr[4];
        }else if(arr[1].equals(oper[0]) && arr[3].equals(oper[2])){
            res = brr[0] + brr[2] * brr[4];
        }else if(arr[1].equals(oper[2]) && arr[3].equals(oper[2])){
            res = brr[0] * brr[2] * brr[4];
        }else if(arr[1].equals(oper[2]) && arr[3].equals(oper[0])){
            res = brr[0] * brr[2] + brr[4];
        }else if(arr[1].equals(oper[0]) && arr[3].equals(oper[3])){
            res = brr[0] + brr[2] / brr[4];
        }else if(arr[1].equals(oper[3]) && arr[3].equals(oper[3])){
            res = brr[0] / brr[2] / brr[4];
        }else if(arr[1].equals(oper[3]) && arr[3].equals(oper[0])){
            res = brr[0] / brr[2] + brr[4];
        }else if(arr[1].equals(oper[1]) && arr[3].equals(oper[2])){
            res = brr[0] - brr[2] * brr[4];
        }else if(arr[1].equals(oper[2]) && arr[3].equals(oper[1])){
            res = brr[0] * brr[2] - brr[4];
        }else if(arr[1].equals(oper[1]) && arr[3].equals(oper[3])){
            res = brr[0] - brr[2] / brr[4];
        }else if(arr[1].equals(oper[3]) && arr[3].equals(oper[1])) {
            res = brr[0] / brr[2] - brr[4];
        }
        System.out.println(res);
    }
}