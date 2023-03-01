package chapter6;
import java.util.Scanner;
public class Task_6 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String chr = in.next();

        if(str.indexOf(chr)>-1){
            System.out.println(str.indexOf(chr));
            }else{
                System.out.println("THERE IS NO SUCH LETTER");
            }
        }
    }
