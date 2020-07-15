package data_extraction.sequential_approach;

import data_extraction.Parser;
import data_extraction.PurchaseEvent;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ItemIdVsBuyCount {

    private final Set<Integer> uniqueItemId;
    private List<PurchaseEvent> purchaseEvents;

    ItemIdVsBuyCount(String filePath) throws IOException {
        Parser parser = new Parser();
        parser.parse(filePath);
        uniqueItemId = parser.getUniqueItemId();
        purchaseEvents = parser.getPurchaseEvents();
    }

    public Map<Integer, Integer> getData() {
        Map<Integer, Integer> itemIDVsBuysCount = new HashMap<>();
        int[] buysCount = new int[1];
        uniqueItemId.forEach(itemId -> {
            buysCount[0] = (int) purchaseEvents.stream().filter(purchaseEvent -> purchaseEvent.getItemId() == itemId).count();
            itemIDVsBuysCount.put(itemId, buysCount[0]);
        });
        return itemIDVsBuysCount;
    }
}
