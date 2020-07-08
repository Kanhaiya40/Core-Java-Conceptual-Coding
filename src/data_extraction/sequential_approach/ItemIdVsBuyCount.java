package data_extraction.sequential_approach;

import data_extraction.Parser;
import data_extraction.PurchaseEvent;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ItemIdVsBuyCount {

    private final List<PurchaseEvent> purchaseEvents;
    private Set<Integer> uniqueItemId;

    ItemIdVsBuyCount(String filePath) throws IOException {
        Parser parser = new Parser();
        parser.parse(filePath);
        uniqueItemId = parser.getUniqueItemId();
        purchaseEvents = parser.getPurchaseEvents();
    }

    public Map<Integer, Integer> getData() {
        Map<Integer, Integer> itemIdVsBuyCountData = new HashMap<>();
        for (Integer itemId : uniqueItemId) {
            int buyCount = 0;
            for (PurchaseEvent purchaseEvent : purchaseEvents) {
                if (purchaseEvent.getItemId() == itemId) {
                    buyCount = buyCount + purchaseEvent.getQuantity();
                }
            }
            itemIdVsBuyCountData.put(itemId, buyCount);
        }
        return itemIdVsBuyCountData;
    }
}
