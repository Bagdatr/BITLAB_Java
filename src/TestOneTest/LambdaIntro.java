package TestOneTest;

public class LambdaIntro {
    public static void main(String[]args){
        ISum summer = new ISum() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };

        ISum summer2 = (a, b) -> a + b;
    }

    public interface ISum{
        public int sum(int a, int b);
    }
}
