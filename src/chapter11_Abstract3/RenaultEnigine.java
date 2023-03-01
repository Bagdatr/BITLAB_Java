package chapter11_Abstract3;

public class RenaultEnigine extends Engine{
    double extraTurboEnergy;
    public RenaultEnigine(){
        super();
        this.extraTurboEnergy = 0.0;
    }
    public RenaultEnigine(double engineVolume,int cylinderAmount,double engineWeight,double extraTurboEnergy){
        super(engineVolume,cylinderAmount,engineWeight);
        this.extraTurboEnergy = extraTurboEnergy;
    }

    public double getExtraTurboEnergy() {
        return extraTurboEnergy;
    }
    public void setExtraTurboEnergy(double extraTurboEnergy) {
        this.extraTurboEnergy = extraTurboEnergy;
    }

    double efficiency(){
        return 0.27;
    }
    double throttleEnergy(){
        return engineVolume*cylinderAmount*110 + extraTurboEnergy;
    }
    double breakEnergy(){
        return engineWeight*2.1;
    }
}
