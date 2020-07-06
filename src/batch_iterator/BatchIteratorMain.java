package batch_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BatchIteratorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Batch Size:");
        int batchSize = scanner.nextInt();
        List<Integer> elements = new ArrayList<>();
        elements.add(10);
        elements.add(20);
        elements.add(30);
        elements.add(40);
        elements.add(50);
        BatchIterator<Integer> batchIterator = new BatchIterator<>(elements, batchSize);
        while (batchIterator.hasNext()) {
            System.out.println(batchIterator.next());
        }
    }
}
