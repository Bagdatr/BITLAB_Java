package Player;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        Player []team1 = new Player[5];
        Player []team2 = new Player[5];

        team1[0] = new Player(1,"Leonel","Messi","attacker");
        team1[1] = new Player(2,"Yuriy","Gagarin","defender");
        team1[2] = new Player(3,"Garry","Freeman","attacker");
        team1[3] = new Player(4,"Barry","Scofield","defender");

        team2[0] = new Player(5,"Boris","Johnson","attacker");
        team2[1] = new Player(6,"Joe","Biden","goalkeeper");

        Club club1 = new Club("Barcelova", "Spain", 98,team1);
        Club club2 = new Club("Inter", "Italy", 97,team2);

        Club []clubs = {club1,club2};

        for (int i = 0; i < clubs.length; i++) {
            clubs[i].printClubData();
        }
    }
}
