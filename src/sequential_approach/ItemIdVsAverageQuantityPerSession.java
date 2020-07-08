package sequential_approach;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ItemIdVsAverageQuantityPerSession {

    private List<PurchaseEvent> purchaseEvents;
    private Set<Integer> uniqueSession;
    private Set<Integer> uniqueItemId;

    ItemIdVsAverageQuantityPerSession(String filePath) throws IOException {
        Parser parser = new Parser();
        parser.parse(filePath);
        uniqueSession = parser.getUniqueSession();
        uniqueItemId = parser.getUniqueItemId();
        purchaseEvents = parser.getPurchaseEvents();
    }

    public Map<Integer, Integer> getAveragePerSession() {
        Map<Integer, Integer> itemIdVsAverageQuantityPerSession = new HashMap<>();
        for (Integer eachSession : uniqueSession) {
            int totalSession = 0;
            int totalQuantityPerSession = 0;
            for (PurchaseEvent purchaseEvent : purchaseEvents) {
                if (purchaseEvent.getSessionId() == eachSession) {
                    totalSession++;
                    totalQuantityPerSession = totalQuantityPerSession + purchaseEvent.getQuantity();
                }
            }
            try {
                itemIdVsAverageQuantityPerSession.put(eachSession, totalQuantityPerSession / totalSession);
            } catch (ArithmeticException arithmeticException) {
                System.out.println("Diving By Zero");
            }
        }
        return itemIdVsAverageQuantityPerSession;
    }

    public Map<Integer, Integer> getData() {
        Map<Integer, Integer> averageQuantityPerSession = getAveragePerSession();
        Map<Integer, Integer> itemIdWithAverageQuantityPerSession = new HashMap<>();
        for (Integer itemId : uniqueItemId) {
            for (PurchaseEvent purchaseEvent : purchaseEvents) {
                if (averageQuantityPerSession.containsKey(purchaseEvent.getSessionId()) && purchaseEvent.getItemId() == itemId) {
                    itemIdWithAverageQuantityPerSession.put(itemId, averageQuantityPerSession.get(purchaseEvent.getSessionId()));
                }
            }
        }
        return itemIdWithAverageQuantityPerSession;
    }
}
