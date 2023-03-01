package chapter11_Abstract2;

public class CubeGold extends GoldShape{
    double side;
    public CubeGold(){
        this.side = 0.0;
    }
    public CubeGold(double side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    double getVolume(){
        return side*side*side;
    }
}
