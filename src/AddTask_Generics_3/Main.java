package AddTask_Generics_3;

public class Main {
    public static void main(String[]args){

        Swap<Integer, String> integerStringSwap = new Swap<>(29926,"Zhansaya");
        integerStringSwap.setFirst(29926);
        integerStringSwap.setSecond("Zhansaya");
        integerStringSwap.getFirst();
        integerStringSwap.getSecond();
        integerStringSwap.swap();
    }
}
