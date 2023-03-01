package chapter5;
import java.util.Scanner;
public class Task_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int max = arr[0][0];
        int min = arr[0][0];
        int maxR = 0;
        int maxC = 0;
        int minR = 0;
        int minC = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    maxR = i;
                    maxC = j;
                }
                if (min > arr[i][j]) {
                    min = arr[i][j];
                    minR = i;
                    minC = j;
                }
            }
        }
        int temp = arr[minR][minC];
        arr[minR][minC] = arr[maxR][maxC];
        arr[maxR][maxC] = temp;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
                }
            System.out.println();
        }
    }
}
