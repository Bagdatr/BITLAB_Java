package chapter11_Abstract;

public class Burger extends Food {
    int meatAmount; // количество мяса 1,2 или 3
    int meatType; //тип мяса, 1 - это говядина, 2 - это курица

    public Burger() {
        super();
        this.meatAmount = 0;
        this.meatType = 0;
    }
    public Burger(String name, int meatAmount, int meatType) {
        super(name);
        this.meatAmount = meatAmount;
        this.meatType = meatType;
    }

    public int getMeatAmount() {
        return meatAmount;
    }
    public void setMeatAmount(int meatAmount) {
        this.meatAmount = meatAmount;
    }
    public int getMeatType() {
        return meatType;
    }
    public void setMeatType(int meatType) {
        this.meatType = meatType;
    }

    public double getCalories() {
        if (meatType == 1) {
            return meatAmount * 840;
        } else if (meatType == 2) {
            return meatAmount * 560;
        }else{
            return 0;
        }
    }
}
