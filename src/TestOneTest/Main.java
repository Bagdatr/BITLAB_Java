package TestOneTest;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        ElementHolder <Double> elementHolder = new ElementHolder<>(Double.class);
        elementHolder.add(100.5);
        elementHolder.add(200.3);
        elementHolder.add(300.7);
        elementHolder.add(500.0);
        elementHolder.printAll();
    }
}
