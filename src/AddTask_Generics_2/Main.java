package AddTask_Generics_2;

public class Main {
    public static void main(String[]args){
        Pair<Integer, String> pair = new Pair<>(29926, "Zhansaya");
        System.out.println("Value -> "+ pair.getFirst());
        System.out.println("Value -> "+ pair.getSecond());

    }
}
