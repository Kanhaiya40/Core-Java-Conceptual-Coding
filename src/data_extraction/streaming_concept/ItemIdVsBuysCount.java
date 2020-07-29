package data_extraction.streaming_concept;

import data_extraction.PurchaseEvent;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class ItemIdVsBuysCount implements StreamReport {

    private static final Map<Integer, Integer> itemIdVsBuysCount = new HashMap<>();

    @Override
    public void process(PurchaseEvent purchaseEvent) {
        if (itemIdVsBuysCount.containsKey(purchaseEvent.getItemId())) {
            itemIdVsBuysCount.put(purchaseEvent.getItemId(), itemIdVsBuysCount.get(purchaseEvent.getItemId()) + 1);
        } else {
            itemIdVsBuysCount.put(purchaseEvent.getItemId(), 1);
        }
    }

    @Override
    public void printReport(PrintWriter printWriter) {
        printWriter.println(itemIdVsBuysCount);
        printWriter.flush();
    }
}
