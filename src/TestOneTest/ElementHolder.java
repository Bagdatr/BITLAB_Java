package TestOneTest;
import java.lang.reflect.Array;
public class ElementHolder <T>{
    private T elements[];
    private int currentIndex = 0;
    public ElementHolder(Class<T>clazz){
        elements = (T[])Array.newInstance(clazz,1000);
    }
    public void add(T element){
        elements[currentIndex] = element;
        currentIndex++;
    }
    public T get(int index){
        return elements[index];
    }
    public void printAll(){
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(elements[i]);
        }
    }
}
