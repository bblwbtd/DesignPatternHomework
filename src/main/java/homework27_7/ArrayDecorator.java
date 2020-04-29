package homework27_7;

import java.util.Iterator;

public class ArrayDecorator<T> implements Iterator<T> {

    private final T[] array;
    private int pointer = 0;
    public ArrayDecorator(T[] array){
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return array.length > 0 && pointer < array.length;
    }

    @Override
    public T next() {
        if (pointer < array.length){
            T data = array[pointer];
            pointer++;
            return data;
        }
        return null;
    }

}
