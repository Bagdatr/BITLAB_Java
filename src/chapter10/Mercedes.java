package chapter10;

public class Mercedes extends Car{
    String classType; // E Class, S Class, M Class …
    public Mercedes(){
        super();
        this.classType = "No class type";
    }
    public Mercedes(String name, String model, int maxSpeed, int year, double volume, String classType){
        super(name, model, maxSpeed, year, volume);
        this.classType = classType;
    }
    public String ride(){
        return name+" Car "+name+" "+model+" with max speed "+maxSpeed+" km/h from "+year+" year with engine volume "+volume+" liters with "+classType+" class is riding.";
    }
}
