package chapter10_Olympic;

public class Swimmer extends Sportsman{
    String style;
    double recordTime;
    public Swimmer(){
        super();
        this.style = "No style";
        this.recordTime = 0.0;
    }
    public Swimmer(String fullName,int age,String country,String style,double recordTime){
        super(fullName,age,country);
        this.style = style;
        this.recordTime = recordTime;
    }
    public String play(){
        return "Swimmer "+fullName+" from "+country+", "+age+" years old with "+style+" style swimmed in "+recordTime+" seconds";
    }
}
