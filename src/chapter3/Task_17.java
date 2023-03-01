import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int i = 0;
        int k = 1;
        int sum = 0;

        while (i < n) {
            sum = sum + k;
            k = k + 2;
            i++;
        }
        System.out.print(sum);
    }
}
