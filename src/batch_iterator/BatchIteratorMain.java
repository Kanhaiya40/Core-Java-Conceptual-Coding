package batch_iterator;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BatchIteratorMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Batch Size:");
        int batchSize=scanner.nextInt();
        BatchIterator<Integer> batchIterator=new BatchIterator<>(5,batchSize);
        batchIterator.add(23);
        batchIterator.add(66);
        batchIterator.add(98);
        batchIterator.add(43);
        batchIterator.add(32);
        System.out.println(batchIterator);
        Iterator<List<Integer>> batchIterator1=batchIterator.iterator();
        while (batchIterator1.hasNext()){
            System.out.println(batchIterator1.next());
        }
    }
}
