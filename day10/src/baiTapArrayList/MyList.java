package baiTapArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] element;

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapacity() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }

    public MyList(int capacity) {

    }

    public void add(int index, E e) {
        if (size == element.length) {
            ensureCapacity();
        }
        element[size++] = element[size];
        for (int i = size; i > index; i--) {
            element[i] = element[i - 1];
        }
        element[index] = e;
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size" + index);
        }
        return (E) element[index];
    }
//    public E remove(int index){
//
//    }
//    public int size(){
//    }
//    public boolean contains(E o){
//
//    }
//    public int indexOf(E o){
//
//    }
//    public boolean add (E o){
//
//    }
//    public void ensureCapacity (int minCapacity){
//        minCapacity = element.length*2;
//        element = Arrays.copyOf(element, minCapacity);
//    }
//    public E get(int i) {
//
//    }
//    public void clear(){
//
//    }
}
