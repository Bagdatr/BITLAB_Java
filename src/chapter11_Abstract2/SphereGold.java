package chapter11_Abstract2;

public class SphereGold extends GoldShape{
    double radius;

    public SphereGold(){
        this.radius = 0.0;
    }
    public SphereGold(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getVolume(){
        return 3.14*(radius*radius*radius)*4/3;
    }
}
