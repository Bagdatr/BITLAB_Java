package chapter7;
import java.util.Scanner;
public class Task_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(check(n));

    }
    public static String check(int a){
        String []season = {"Winter","Spring","Summer","Autumn"};
        String res = "";
        int d = a;
        if(d==12 || d>=1 && d<=2){
            res = season[0];
        }else if(d>2 && d<=5){
            res = season[1];
        }else if(d>5 && d<=8){
            res = season[2];
        }else if(d>8 && d<=11){
            res = season[3];
        }return res;
    }
}