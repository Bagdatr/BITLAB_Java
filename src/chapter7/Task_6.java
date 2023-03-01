package chapter7;
import java.util.Scanner;
public class Task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String userLog = in.nextLine();
        String userPas = in.nextLine();

        System.out.println(check(userLog,userPas));
    }
    public static String check(String str1, String str2){
        if(str1.equals("admin") && str2.equals("qwerty")){
            return "Authentication completed";
        }else return "Invalid login or password";
    }
}
