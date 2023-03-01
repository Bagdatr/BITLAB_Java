package chapter16_Map_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Account> users = new HashMap<>();
        int size = 5;
        for(int i=0; i<size; i++){
            users.put(in.next(),new Account(in.next(),in.next(),in.next()));
        }

//        Account user1 = new Account("Ilyas ", "Zhuanyshev", "Almaty");
//        Account user2 = new Account("Madina", "Nurzhanova", "Shymkent");
//        Account user3 = new Account("Elzhan", "Samatov", "Atyrau");
//        Account user4 = new Account("Erik", "Berikov", "Astana");
//        Account user5 = new Account("Bolat", "Nurbolov", "Semey");
//
//        users.put("890102301734", user1);
//        users.put("910103405353", user2);
//        users.put("990105301735", user3);
//        users.put("900304304522", user4);
//        users.put("940708302344", user5);
//
//        String input = in.next();
//
//        boolean x = false;
//        for (String key : users.keySet()) {
//            if (input.equals(key)) {
//                x = true;
//                System.out.println(users.get(key).vidod() + key);
//            }
//        }
//        if (x == false) {
//            System.out.println("Account not found");
//        }

        for(String key:users.keySet()){
            System.out.println(users.get(key).vidod()+key);
        }
    }
}
