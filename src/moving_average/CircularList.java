package moving_average;

import java.util.LinkedList;
import java.util.Queue;

public class CircularList<E> {

    private final Queue<E> queue;

    CircularList() {
        this.queue = new LinkedList<>();
    }

    public void add(E item) {
        queue.add(item);
    }

    public void remove() {
        queue.remove();
    }

    public void extendElementOfSeries(E item) {
        queue.remove();
        queue.add(item);
    }

    @SuppressWarnings("unchecked")
    public E getElement(final int index) {
        E[] arrayOfQueueElements = (E[]) queue.toArray();
        return arrayOfQueueElements[(index) % arrayOfQueueElements.length];
    }

    public int size() {
        return queue.size();
    }

    public String toString() {
        return "" + queue.toString() + "";
    }
}
