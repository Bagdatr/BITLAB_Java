package chapter5;
import java.util.Scanner;

public class Task_12 {
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

        int x = arr[0][0];
        int r = 0;
        int c = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(x<arr[i][j]){
                    x = arr[i][j];
                    r = i;
                    c = j;
                }
            }
        }
        System.out.println(x);
        System.out.println(r+" "+c);
    }
}
