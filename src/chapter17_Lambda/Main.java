package chapter17_Lambda;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){

       SumOperation sumOperation = new SumOperation();
       Operator operator = (a,b) -> sumOperation.getSum(a,b);
       System.out.println("Sum: "+operator.toOperate(15,20));

       MultiplyOperation multiplyOperation = new MultiplyOperation();
       Operator operator1 = (a,b) -> multiplyOperation.getMultiplication(a,b);
        System.out.println("Multiplication: "+operator1.toOperate(10,2));
    }
}
