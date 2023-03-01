package chapter14_Generics_Task1;
import java.lang.reflect.Array;
public class Printer<T> {
    private T value;

    void setValue(T value){
        this.value = value;
    }
    T getValue(){
        return (T) value;
    }
    void printValue(){
        System.out.println("Value is "+value);
    }
    void refresh(){
        value = null;
    }
}
