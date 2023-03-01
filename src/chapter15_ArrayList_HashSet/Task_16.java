package chapter15_ArrayList_HashSet;
import java.util.Scanner;
import java.util.HashSet;
public class Task_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> names = new HashSet<>();
        while (true) {
            String x = (in.next().toLowerCase());
            if (x.equals("stop")) break;
            names.add(x);
        }
        int count = 0;
        for (String e : names) {
            for(int i=0;i<e.length();i++){
                if(String.valueOf(e.charAt(i)).equals("a")){
                    count++;
                }
                if(String.valueOf(e.charAt(i)).equals("e")){
                    count++;
                }
                if(String.valueOf(e.charAt(i)).equals("i")){
                    count++;
                }
                if(String.valueOf(e.charAt(i)).equals("o")){
                    count++;
                }
                if(String.valueOf(e.charAt(i)).equals("u")){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
