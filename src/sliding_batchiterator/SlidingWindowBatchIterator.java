package sliding_batchiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SlidingWindowBatchIterator<E> implements Iterator<List<E>> {

    private final List<E> iteratedElements = new ArrayList<>();
    private Iterator<E> circularList;

    SlidingWindowBatchIterator(CircularList<E> circularList) {
        this.circularList = circularList.iterator();
    }

    @Override
    public String toString() {
        return "" + iteratedElements;
    }

    @Override
    public boolean hasNext() {
        return circularList.hasNext();
    }

    @Override
    public List<E> next() {
        iteratedElements.clear();
        while (circularList.hasNext()) {
            iteratedElements.add(circularList.next());
        }
        return iteratedElements;
    }
}
