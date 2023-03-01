package chapter17_Lambda;

public class MultiplyOperation {
    Operator operator = (a,b) -> a * b;
    public int getMultiplication(int a,int b){
        return operator.toOperate(a,b);
    }
}
