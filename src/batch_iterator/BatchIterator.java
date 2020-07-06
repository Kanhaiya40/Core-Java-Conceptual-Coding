package batch_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BatchIterator<E> implements Iterator<List<E>> {

    private final Iterator<E> iterator;
    private final int batchSize;
    private final List<E> iteratedElements = new ArrayList<>();

    BatchIterator(Iterable<E> iterable, int batchSize) {
        this.batchSize = batchSize;
        this.iterator =iterable.iterator();
    }

    @Override
    public String toString() {
        return "" + iteratedElements;
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public List<E> next() {
        iteratedElements.clear();
        int index=0;
        while (iterator.hasNext() && index<batchSize){
            iteratedElements.add(iterator.next());
            index++;
        }
        return iteratedElements;
    }
}
