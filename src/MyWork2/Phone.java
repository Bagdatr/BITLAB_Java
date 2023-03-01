package MyWork2;
public class Phone {
    String name;
    String model;
    int price;

    public Phone(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }
    public Phone(){
    }
    public String getData(){
        return name+" - "+model+" for "+price+" KZT";
    }
}
