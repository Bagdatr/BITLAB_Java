package chapter12;

public class Users {
    String name;
    String surname;

    public Users(){
        this.name = "No name";
        this.surname = "No surname";
    }
    public Users(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
}
