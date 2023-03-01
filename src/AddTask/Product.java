package AddTask;

public class Product {
    String name;
    int quantity;
    int price;
    String category; //например, продукты питания, бытовая химия, электроника и т.д.

    public Product(){
        this.name = "No name";
        this.quantity = 0;
        this.price = 0;
        this.category = "No category";
    }
    public Product(String name, int quantity, int price, String category) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
