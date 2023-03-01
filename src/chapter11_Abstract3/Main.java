package chapter11_Abstract3;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        FerrariEngine f1 = new FerrariEngine(in.nextDouble(), in.nextInt(), in.nextDouble());
        FerrariEngine f2 = new FerrariEngine(in.nextDouble(), in.nextInt(), in.nextDouble());
        RenaultEnigine r1 = new RenaultEnigine(in.nextDouble(), in.nextInt(), in.nextDouble(), in.nextDouble());
        RenaultEnigine r2 = new RenaultEnigine(in.nextDouble(), in.nextInt(), in.nextDouble(), in.nextDouble());

        Engine[]engines = {f1,f2,r1,r2};

        for (int i = 0; i < engines.length; i++) {
            System.out.println("Received maximum speed: "+engines[i].getMaxSpeed());
        }
    }
}
