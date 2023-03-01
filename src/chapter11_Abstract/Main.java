package chapter11_Abstract;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        Chocolate Snickers = new Chocolate(in.next(), in.nextInt());
        Chocolate Twix = new Chocolate(in.next(), in.nextInt());
        Burger BurgerKing = new Burger(in.next(), in.nextInt(), in.nextInt());
        Burger McDonalds = new Burger(in.next(), in.nextInt(), in.nextInt());
        Coke CocaCola = new Coke(in.next(), in.nextDouble(), in.nextBoolean());
        Coke FuseTea = new Coke(in.next(), in.nextDouble(), in.nextBoolean());

        Food []meal = {Snickers,Twix,BurgerKing,McDonalds,CocaCola,FuseTea};

        double maxCal = meal[0].getCalories();
        String maxName = "";
        for (int i = 0; i < meal.length; i++) {
            if(maxCal<meal[i].getCalories()){
                maxCal = meal[i].getCalories();
                maxName = meal[i].name;
            }
            System.out.println(meal[i].name+" - > "+meal[i].getCalories());
        }
        System.out.println("The most high-calorie is "+maxName+" - > "+maxCal);
    }
}
