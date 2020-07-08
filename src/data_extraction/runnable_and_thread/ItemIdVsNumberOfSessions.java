package data_extraction.runnable_and_thread;

import data_extraction.Parser;
import data_extraction.PurchaseEvent;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ItemIdVsNumberOfSessions implements Runnable {

    private final List<PurchaseEvent> purchaseEvents;
    private final Set<Integer> uniqueItemId;

    ItemIdVsNumberOfSessions(String filePath) throws IOException {
        Parser parser = new Parser();
        parser.parse(filePath);
        purchaseEvents = parser.getPurchaseEvents();
        uniqueItemId = parser.getUniqueItemId();
    }

    @Override
    public void run() {
        Map<Integer, Integer> itemIdVsNumberOfSession = new TreeMap<>();
        for (Integer uniqueId : uniqueItemId) {
            int noOfSessions = 0;
            for (PurchaseEvent purchaseEvent : purchaseEvents) {
                if (purchaseEvent.getItemId() == uniqueId) {
                    noOfSessions++;
                }
            }
            itemIdVsNumberOfSession.put(uniqueId, noOfSessions);
        }
        System.out.println(itemIdVsNumberOfSession);
    }
}
