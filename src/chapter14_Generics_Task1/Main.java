package chapter14_Generics_Task1;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){

        Printer<Integer> printer = new Printer<>();
        printer.setValue(1);
        printer.printValue();
    }
}
