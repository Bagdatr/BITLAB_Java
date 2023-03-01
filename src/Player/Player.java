package Player;

public class Player {
    int number;
    String name;
    String surname;
    String position;

    public Player(){
        this.number = 0;
        this.name = "No Name";
        this.surname = "No Surname";
        this.position = "No Position";
    }

    public Player(int number,String name,String surname,String position){
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public String toString(){
        return "Player{number="+number+", name='"+name+"', surname='"+surname+"', position='"+position+"'}";
    }
}
