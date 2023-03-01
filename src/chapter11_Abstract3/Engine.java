package chapter11_Abstract3;

public abstract class Engine {
    double engineVolume;
    int cylinderAmount;
    double engineWeight;
    public Engine(){
        super();
        this.engineVolume = 0.0;
        this.cylinderAmount = 0;
        this.engineWeight = 0.0;
    }
    public Engine(double engineVolume,int cylinderAmount,double engineWeight){
        super();
        this.engineVolume = engineVolume;
        this.cylinderAmount = cylinderAmount;
        this.engineWeight = engineWeight;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    public int getCylinderAmount() {
        return cylinderAmount;
    }
    public void setCylinderAmount(int cylinderAmount) {
        this.cylinderAmount = cylinderAmount;
    }
    public double getEngineWeight() {
        return engineWeight;
    }
    public void setEngineWeight(double engineWeight) {
        this.engineWeight = engineWeight;
    }

    abstract double efficiency();
    abstract double throttleEnergy();
    abstract double breakEnergy();

    double getMaxSpeed(){
        return (throttleEnergy()-breakEnergy())*efficiency();
    }
}
