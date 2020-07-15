package data_extraction.sequential_approach;

import data_extraction.Parser;
import data_extraction.PurchaseEvent;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ItemIdVsNumberOfSessions {

    private List<PurchaseEvent> purchaseEvents;
    private Set<Integer> uniqueItemId;

    ItemIdVsNumberOfSessions(String filePath) throws IOException {
        Parser parser = new Parser();
        parser.parse(filePath);
        purchaseEvents = parser.getPurchaseEvents();
        uniqueItemId = parser.getUniqueItemId();
    }


    public Map<Integer, Integer> getData() {
        Map<Integer, Integer> itemIdVsNumberOfSession = new HashMap<>();
        final int[] noOfSessions = new int[1];
        uniqueItemId.forEach(itemId -> {
            noOfSessions[0] = (int) purchaseEvents.stream().filter(purchaseEvent -> purchaseEvent.getItemId() == itemId).count();
            itemIdVsNumberOfSession.put(itemId, noOfSessions[0]);
        });
        return itemIdVsNumberOfSession;
    }
}
