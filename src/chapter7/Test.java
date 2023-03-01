package chapter7;
import java.util.Scanner;
public class Test {
    public static void main (String[]args){
        Scanner in = new Scanner (System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        getMax(a,b,c);
        System.out.println(getMax(a,b,c));

    }
    public static int getMax (int a, int b, int c){
        if(a>b && a>c){
            return a;
        }else if(b>a && b>c){
            return b;
        }else{
            return c;
        }
    }
}