package AddTask;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
//                                название     кол-во       цена        кат-ия
        Product abc = new Product(in.next(),in.nextInt(),in.nextInt(),in.next());
        Product abc2 = new Product(in.next(),in.nextInt(),in.nextInt(),in.next());
        Product abc3 = new Product(in.next(),in.nextInt(),in.nextInt(),in.next());
        Product abc4 = new Product(in.next(),in.nextInt(),in.nextInt(),in.next());

        Store myStore = new Store();
        myStore.addProduct(abc);
        myStore.addProduct(abc2);
        myStore.addProduct(abc3);
        myStore.addProduct(abc4);

        myStore.getTotalValue();

        String category = new String(in.next());
        Store find = new Store();
        find.getProductsWithCategory(category);

    }
}

/* Choco 400 100 food
Milk 200 200 food
Tide 300 500 fmcg
Gillette 500 600 fmcg */