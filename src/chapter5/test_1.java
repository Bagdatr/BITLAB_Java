package chapter5;
import java.util.Scanner;
public class test_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int i=0; i<n;i++){
            for(int j=n;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
