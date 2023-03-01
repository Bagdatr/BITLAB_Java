package chapter11_Abstract3;

public class FerrariEngine extends Engine{

    public FerrariEngine(){
        super();
    }
    public FerrariEngine(double engineVolume,int cylinderAmount,double engineWeight){
        super(engineVolume,cylinderAmount,engineWeight);
    }

    double efficiency(){
        return 0.25;
    }
    double throttleEnergy(){
        return getEngineVolume()*getCylinderAmount()*100;
    }
    double breakEnergy(){
        return engineWeight*2;
    }
    public double getMaxSpeed() {
        return super.getMaxSpeed();
    }
}
