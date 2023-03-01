package AddTask_Generics_1;

public class Main {
    public static void main(String[]args){

        Printer<Integer> printer = new Printer<>();
        printer.setValue(1);
        printer.printValue();
    }
}
