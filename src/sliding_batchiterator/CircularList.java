package sliding_batchiterator;

import java.util.Arrays;
import java.util.Iterator;

public class CircularList<E> implements Iterable<E> {

    private final Object[] customArray;
    private int rear;

    CircularList(int size) {
        customArray = new Object[size];
        this.rear = -1;
    }

    public void add(E item) {
        rear = (rear + 1) % customArray.length;
        customArray[rear] = item;
    }

    @SuppressWarnings("unchecked")
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            int temporaryIndex = 0;

            @Override
            public boolean hasNext() {
                return temporaryIndex < customArray.length;
            }

            @Override
            public E next() {
                if (hasNext())
                    return (E) customArray[temporaryIndex++];
                return null;
            }
        };
    }

    public int size() {
        return customArray.length;
    }

    public String toString() {
        return "" + Arrays.toString(customArray) + "";
    }
}
