package chapter13_TryCatch_Tasks;

public class Company {
    String name;
    Worker director;

    public Company() {
        this.name = "No name";
        this.director = null;
    }
    public Company(String name, Worker director) {
        this.name = name;
        this.director = director;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Worker getDirector() {
        return director;
    }
    public void setDirector(Worker director) {
        this.director = director;
    }

    public String getData(){
        try{
            return "Company name: "+name+". Information about director -> "+director.name+" "+director.surname+".";
        }catch (NullPointerException e){
            return "Data not found";
        }
    }
}
