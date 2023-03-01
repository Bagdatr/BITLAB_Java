package chapter10_Olympic;

public class Sportsman {
    String fullName;
    int age;
    String country;
    public Sportsman(){
        this.fullName = "No name";
        this.age = 0;
        this.country = "No country";
    }
    public Sportsman(String fullName,int age,String country){
        this.fullName = fullName;
        this.age = age;
        this.country = country;
    }

    public String play(){
        return "Sportsman "+fullName+" from "+country+" "+age+" years old is playing";
    }
}