package chapter10_Olympic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Gymnast g1 = new Gymnast(in.next(), in.nextInt(), in.next(), in.nextInt(), in.nextInt(), in.next());
        Gymnast g2 = new Gymnast(in.next(), in.nextInt(), in.next(), in.nextInt(), in.nextInt(), in.next());
        Footballer f1 = new Footballer(in.next(), in.nextInt(), in.next(), in.next(), in.next());
        Footballer f2 = new Footballer(in.next(), in.nextInt(), in.next(), in.next(), in.next());
        Swimmer s1 = new Swimmer(in.next(), in.nextInt(), in.next(), in.next(), in.nextDouble());
        Swimmer s2 = new Swimmer(in.next(), in.nextInt(), in.next(), in.next(), in.nextDouble());

        Sportsman[] sportsmansList = {g1, g2, f1, f2, s1, s2};

        OlympicGames p1 = new OlympicGames(in.next(),in.nextInt(),sportsmansList);

        System.out.println(p1.play());

        for (int i = 0; i < sportsmansList.length; i++) {
            System.out.println(sportsmansList[i].play());
        }
    }
}
