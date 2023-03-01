package chapter9;

public class Phone {
    String name;
    String model;
    int price;

    public Phone(){
        this.name = "No name";
        this.model = "No model";
        this.price = 0;
    }
    public Phone(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return name+ " " + model+ " " + price;
    }
    public String getCategory(){
        if(price>1000){
            return "TOP";
        }else if(price<=1000 && price>=500){
            return "MEDIUM";
        }else{
            return "SIMPLE";
        }
    }
}
