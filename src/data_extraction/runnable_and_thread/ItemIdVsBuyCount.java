package data_extraction.runnable_and_thread;

import data_extraction.Parser;
import data_extraction.PurchaseEvent;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ItemIdVsBuyCount implements Runnable {

    private final List<PurchaseEvent> purchaseEvents;
    private final Set<Integer> uniqueItemId;

    ItemIdVsBuyCount(String filePath) throws IOException {
        Parser parser = new Parser();
        parser.parse(filePath);
        purchaseEvents = parser.getPurchaseEvents();
        uniqueItemId = parser.getUniqueItemId();
    }

    @Override
    public void run() {
        Map<Integer, Integer> itemIdVsBuyCountData = new TreeMap<>();
        for (Integer itemId : uniqueItemId) {
            int buyCount = 0;
            for (PurchaseEvent purchaseEvent : purchaseEvents) {
                if (purchaseEvent.getItemId() == itemId) {
                    buyCount = buyCount + purchaseEvent.getQuantity();
                }
            }
            itemIdVsBuyCountData.put(itemId, buyCount);
        }
        System.out.println(itemIdVsBuyCountData);
    }
}
