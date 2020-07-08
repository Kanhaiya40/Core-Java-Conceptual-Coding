package sequential_approach;

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
        for (Integer uniqueId : uniqueItemId) {
            int noOfSessions = 0;
            for (PurchaseEvent purchaseEvent : purchaseEvents) {
                if (purchaseEvent.getItemId() == uniqueId) {
                    noOfSessions++;
                }
            }
            itemIdVsNumberOfSession.put(uniqueId, noOfSessions);
        }
        return itemIdVsNumberOfSession;
    }
}
