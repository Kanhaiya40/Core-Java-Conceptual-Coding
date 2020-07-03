package batch_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class BatchIterator<E> implements Iterable<List<E>> {

    private final E[] elements;
    private final int batchSize;
    private int index = 0;

    @SuppressWarnings("unchecked")
    BatchIterator(int size, int batchSize) {
        this.batchSize = batchSize;
        elements = (E[]) new Object[size];
    }

    @Override
    public String toString() {
        return "" + Arrays.toString(elements);
    }

    public void add(E item) {
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException("This is an Array be CareFull");
        } else {
            elements[index++] = item;
        }
    }

    @Override
    public Iterator<List<E>> iterator() {
        return new Iterator<List<E>>() {
            final List<E> iteratedElements = new ArrayList<>(batchSize);
            int temporaryIndex = 0;

            @Override
            public boolean hasNext() {
                return temporaryIndex < elements.length;
            }

            @Override
            public List<E> next() {
                iteratedElements.clear();
                if (hasNext())
                    for (int i = 0; i < batchSize && temporaryIndex < elements.length; i++) {
                        iteratedElements.add(elements[temporaryIndex++]);
                    }
                return iteratedElements;
            }
        };
    }

    private boolean isFull() {
        return index == elements.length;
    }
}
