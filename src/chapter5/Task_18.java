package chapter5;
import java.util.Scanner;

public class Task_18 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int arr[][] = new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = in.nextInt();
            }
        }
        int max = arr[0][0];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(max<arr[i][j]){
                    max = arr[i][j];
                }
            }
            System.out.println(max);
            max = 0;
        }
    }
}
