package chapter16_Map_HashMap;
import java.util.Scanner;
import java.util.HashMap;
public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> players = new HashMap<>();
        while(true){
            players.put(in.next(), in.nextInt());
            if(players.size()==5) break;
        }
        for (String key: players.keySet()) {
            System.out.println(key+" scored "+players.get(key)+" goals in EPL");
        }
    }
}
