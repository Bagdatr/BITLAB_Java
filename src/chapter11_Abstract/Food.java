package chapter11_Abstract;

abstract class Food {
    String name;
    public Food(){
        this.name = "No name";
    }
    public Food(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public abstract double getCalories();
}
