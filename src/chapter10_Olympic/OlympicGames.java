package chapter10_Olympic;

public class OlympicGames {
    String city;
    int year;
    Sportsman sportsmansList[];

    public OlympicGames(String city,int year,Sportsman[] sportsmansList){
        this.city = city;
        this.year = year;
        this.sportsmansList = sportsmansList;
    }

    public String play(){
        return "City: "+city+" Year: "+year;
    }
}
