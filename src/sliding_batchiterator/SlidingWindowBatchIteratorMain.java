package sliding_batchiterator;

public class SlidingWindowBatchIteratorMain {
    public static void main(String[] args) {
        CircularList<Integer> elements = new CircularList<>(5);
        elements.add(10);
        elements.add(20);
        elements.add(30);
        elements.add(40);
        elements.add(50);
        SlidingWindowBatchIterator<Integer> batchIterator = new SlidingWindowBatchIterator<>(elements);
        IterationClass iterationClass = new IterationClass();
        iterationClass.runIterator(batchIterator);
        SlidingWindowBatchIterator<Integer> batchIterator1 = new SlidingWindowBatchIterator<>(elements);
        elements.add(36);
        iterationClass.runIterator(batchIterator1);
    }
}
