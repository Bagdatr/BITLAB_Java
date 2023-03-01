package chapter11_Abstract2;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        SphereGold sg1 = new SphereGold (in.nextDouble());
        SphereGold sg2 = new SphereGold (in.nextDouble());
        CubeGold cg1 = new CubeGold(in.nextDouble());
        CubeGold cg2 = new CubeGold(in.nextDouble());

        GoldShape[]gold = {sg1,sg2,cg1,cg2};

        for (int i = 0; i < gold.length; i++) {
            System.out.println(gold[i].getPrice()+" KZT");
        }
    }
}
