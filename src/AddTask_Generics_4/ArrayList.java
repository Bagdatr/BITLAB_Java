//package AddTask_Generics_4;
//import java.lang.reflect.Array;
//import java.util.Arrays;
//public class ArrayList<T> {
//    private static final int DEFAULT_CAPACITY = 10;
//    private int indexOfElements = 0;
//    private T[] elements;
//
//    public ArrayList(int indexOfElements, T[] elements) {
//        this.indexOfElements = indexOfElements;
//        this.elements = elements;
//    }
//
//    public int getIndexOfElements() {
//        return indexOfElements;
//    }
//
//    public void setIndexOfElements(int indexOfElements) {
//        this.indexOfElements = indexOfElements;
//    }
//
//    public T[] getElements() {
//        return elements;
//    }
//
//    public void setElements(T[] elements) {
//        this.elements = elements;
//    }
//
//    public ArrayList(Class<T> clazz) {
//        //code here
//        elements = (T[]) Array.newInstance(clazz, indexOfElements);
//    }
//
//    public void add(T element) {
//        if (indexOfElements == elements.length) {
//            try {
//                //code here
//                elements[indexOfElements] = element;
//                indexOfElements++;
//            } catch (Exception e){
//                System.out.println("Array is full");
//            }
//        }
//
//        public T get(int index){
//            if (index < 0 || index >= indexOfElements) {
//            try {
//                //code here
//                return index;
//            }
//        }
//
//        public int indexOfElements () {
//            //code here
//            return indexOfElements;
//        }
//
//        public boolean isEmpty () {
//            //code here
//        }
//
//        public void remove ( int index){
//            //if (index < 0  index >= indexOfElements) {
//            try {
//                //code here
//            } catch {
//                //code here
//            }
//        }
//
//        public void clear () {
//            //code here
//        }
//    }
//}