package chapter12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Users[] users = new Users[10];
        for (int i = 0; i < users.length; i++) {
            users[i].setName(in.next());
            users[i].setSurname(in.next());
        }

        UserBeanImp ubi = new UserBeanImp(users);

        ubi.getAllUsers();
        ubi.getUsersByName("John");
        ubi.getUsersBySurname("Smith");
    }
}
