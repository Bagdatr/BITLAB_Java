package chapter17_Lambda;

public class SumOperation {
    Operator operator = (a,b) -> a + b;
    public int getSum(int a, int b) {
        return operator.toOperate(a,b);
    }
}