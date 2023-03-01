    package chapter6;
    import java.util.Scanner;
    public class Task_19 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            int num = Integer.parseInt(String.valueOf(str.charAt(0)));
            int y = num * 2;
            System.out.println(str.charAt(1)+String.valueOf(y));
            }
        }