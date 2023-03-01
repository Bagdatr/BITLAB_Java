package AddTask;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Store extends Product {
    String product;
    ArrayList<Product> products = new ArrayList<>();

/*
Приложение должно быть консольным и позволять пользователю добавлять,
удалять и просматривать продукты на складе. Также должна быть возможность
выводить общую стоимость продукции на складе и список продуктов
определенной категории.
 */

    public Store() {
        super();
        this.product = "No product";
    }

    public Store(String name, int quantity, int price, String category, String product) {
        super(name, quantity, price, category);
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void addProduct(Product product) {
//        добавляет продукт на склад
        products.add(product);
    }

    public void removeProduct(Product product) {
//        удаляет продукт со склада
        products.remove(product);
    }

    public void getTotalValue() {
//        возвращает общую стоимость продукции на складе
        System.out.println(products.stream().map(product1 -> product1.getPrice()).reduce(0, (x, y) -> x + y));
    }

    public void getProductsWithCategory(String category) {
//        возвращает список продуктов определенной категории
        System.out.println(new ArrayList<Product>(products.stream().filter(elem -> elem.getCategory().equals(category)).collect(Collectors.toList())));
    }
}




//        ArrayList<Product> foundProds = new ArrayList<>();
//        for (Product e : products) {
//            if (e.getCategory().equals(category)) {
//                foundProds.add(e);
//            }
//        }
//        for (Product l : foundProds) {
//            System.out.println(l);
//        }