package AddTask_Generics_3;

public class Swap <A, B>{
    private A first;
    private B second;

    public Swap(A first, B second) {
        this.first = first;
        this.second = second;
    }
    public A getFirst() {
        return first;
    }
    public void setFirst(A first) {
        this.first = first;
    }
    public B getSecond() {
        return second;
    }
    public void setSecond(B second) {
        this.second = second;
    }
    public void swap(){
        System.out.println(second+" "+first);
    }
}
