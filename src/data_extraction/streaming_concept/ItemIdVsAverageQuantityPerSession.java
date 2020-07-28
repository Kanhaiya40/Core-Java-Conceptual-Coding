package data_extraction.streaming_concept;

import data_extraction.PurchaseEvent;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ItemIdVsAverageQuantityPerSession implements StreamReport {

    private final Map<Integer, Double> itemIdVsAvgQuantityPerSession = new HashMap<>();
    Set<Integer> uniqueSessionIds = new HashSet<>();

    @Override
    public void process(PurchaseEvent purchaseEvent) {
        if (itemIdVsAvgQuantityPerSession.containsKey(purchaseEvent.getItemId())) {
            if (!uniqueSessionIds.contains(purchaseEvent.getSessionId())) {
                uniqueSessionIds.add(purchaseEvent.getSessionId());
                double avg = (itemIdVsAvgQuantityPerSession.get(purchaseEvent.getItemId())
                        + purchaseEvent.getQuantity()) / uniqueSessionIds.size();
                itemIdVsAvgQuantityPerSession.put(purchaseEvent.getItemId(), avg);
            } else {
                itemIdVsAvgQuantityPerSession.put(purchaseEvent.getItemId(),
                        (itemIdVsAvgQuantityPerSession.get(purchaseEvent.getItemId())
                                + purchaseEvent.getQuantity()) / uniqueSessionIds.size());
            }
        } else {
            uniqueSessionIds.clear();
            itemIdVsAvgQuantityPerSession.put(purchaseEvent.getItemId(), (double) purchaseEvent.getQuantity());
            uniqueSessionIds.add(purchaseEvent.getSessionId());
        }
    }

    @Override
    public void printReport(PrintWriter printWriter) {
        printWriter.println(itemIdVsAvgQuantityPerSession);
        printWriter.flush();
    }
}
