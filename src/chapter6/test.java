package chapter6;
import java.util.Scanner;

public class test {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int arr[][] = new int [n][m];
        int brr[][] = new int [n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                brr[i][j] = in.nextInt();
            }
        }
        int sum = 0;

        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == brr[i][j]) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
