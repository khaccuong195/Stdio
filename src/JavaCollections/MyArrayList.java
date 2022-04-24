package JavaCollections;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<E> implements MyList<E>{
    private E[] elements;
    private final int DEFAULT_SIZE=10;
    private int size =0;

    public MyArrayList(){
        this.elements= (E[]) new Objects [DEFAULT_SIZE];
    }

    private void ensureCapacity(){
        int newsize = elements.length+DEFAULT_SIZE;
        elements= Arrays.copyOf(elements,newsize);
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public E get(int index) {
        return elements[index];
    }

    @Override
    public void add(E e) {
        if( this.size > elements.length){
            ensureCapacity();
        }
        elements[size++]=e;
    }

    @Override
    public void add(int index, E e) {
        if( this.size > elements.length){
            ensureCapacity();
        }
        for (int i= size;i>=index;i--){

            elements[i] = elements[i-1];

        }

    }

    @Override
    public E remove(int index) {
        E temp=elements[index];
        for (int i =index;i<size;i++){
            elements[i]= elements[i+1];
        }
        this.size-=1;
        return temp;

    }

    @Override
    public boolean contain(E e) {
        for (int i = 0;i<size;i++){
            if (elements[i]==e){
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(E e) {
        for (int i=0;i<size;i++){
            if (elements[i]==e){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void clear() {
        for (int i = 0;i<size;i++){
            elements[i]=null;
        }
         this.size=0;
    }
}
