package chapter11_Abstract;

public class Coke extends Food{
    double volumeLiters;
    boolean isSparkling; // Газированная или нет

    public Coke(){
        super();
        this.volumeLiters = 0.0;
        this.isSparkling = true;
    }
    public Coke(String name,double volumeLiters,boolean isSparkling){
        super(name);
        this.volumeLiters = volumeLiters;
        this.isSparkling = isSparkling;
    }

    public double getVolumeLiters() {
        return volumeLiters;
    }
    public void setVolumeLiters(double volumeLiters) {
        this.volumeLiters = volumeLiters;
    }
    public boolean isSparkling() {
        return isSparkling;
    }
    public void setSparkling(boolean isSparkling) {
        this.isSparkling = isSparkling;
    }

    public double getCalories(){
        if(isSparkling){
            return volumeLiters * 400;
        }else{
            return volumeLiters * 100;
        }
    }
}
