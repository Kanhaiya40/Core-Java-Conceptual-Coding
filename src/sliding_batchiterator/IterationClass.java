package sliding_batchiterator;

public class IterationClass {

    public void runIterator(SlidingWindowBatchIterator<Integer> batchIterator) {
        while (batchIterator.hasNext()) {
            System.out.println(batchIterator.next());
        }
    }
}
