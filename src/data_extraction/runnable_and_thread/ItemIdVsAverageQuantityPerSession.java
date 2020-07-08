package data_extraction.runnable_and_thread;

import data_extraction.Parser;
import data_extraction.PurchaseEvent;

import java.io.IOException;
import java.util.*;

public class ItemIdVsAverageQuantityPerSession implements Runnable {
    private final List<PurchaseEvent> purchaseEvents;
    private final Set<Integer> uniqueSession;
    private final Set<Integer> uniqueItemId;

    ItemIdVsAverageQuantityPerSession(String filePath) throws IOException {
        Parser parser = new Parser();
        parser.parse(filePath);
        uniqueSession = parser.getUniqueSession();
        uniqueItemId = parser.getUniqueItemId();
        purchaseEvents = parser.getPurchaseEvents();
    }

    @Override
    public synchronized void run() {
        Map<Integer, Integer> averageQuantityPerSession = getAveragePerSession();
        Map<Integer, Integer> itemIdWithAverageQuantityPerSession = new HashMap<>();
        for (Integer itemId : uniqueItemId) {
            for (PurchaseEvent purchaseEvent : purchaseEvents) {
                if (averageQuantityPerSession.containsKey(purchaseEvent.getSessionId()) && purchaseEvent.getItemId() == itemId) {
                    itemIdWithAverageQuantityPerSession.put(itemId, averageQuantityPerSession.get(purchaseEvent.getSessionId()));
                }
            }
        }
        System.out.println(itemIdWithAverageQuantityPerSession);
    }

    public Map<Integer, Integer> getAveragePerSession() {
        Map<Integer, Integer> itemIdVsAverageQuantityPerSession = new TreeMap<>();
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
}
