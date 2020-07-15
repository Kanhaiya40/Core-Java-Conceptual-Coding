package data_extraction.sequential_approach;

import data_extraction.Parser;
import data_extraction.PurchaseEvent;

import java.io.IOException;
import java.util.*;

public class ItemIdVsAverageQuantityPerSession {

    private List<PurchaseEvent> purchaseEvents;
    private Set<Integer> uniqueItemId;

    ItemIdVsAverageQuantityPerSession(String filePath) throws IOException {
        Parser parser = new Parser();
        parser.parse(filePath);
        uniqueItemId = parser.getUniqueItemId();
        purchaseEvents = parser.getPurchaseEvents();
    }

    public Map<Integer, OptionalDouble> getAverageQuantityPerSession() {
        Map<Integer, OptionalDouble> itemIdVsAverageQuantityPerSession = new HashMap<>();
        uniqueItemId.forEach(itemId -> {
            OptionalDouble average = purchaseEvents.stream().filter(purchaseEvent -> purchaseEvent.getItemId() == itemId).mapToInt(PurchaseEvent::getQuantity).average();
            itemIdVsAverageQuantityPerSession.put(itemId, average);
        });
        return itemIdVsAverageQuantityPerSession;
    }
}
