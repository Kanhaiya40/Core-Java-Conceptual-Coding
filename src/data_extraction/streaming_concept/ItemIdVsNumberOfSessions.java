package data_extraction.streaming_concept;

import data_extraction.PurchaseEvent;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ItemIdVsNumberOfSessions implements StreamReport {

    Map<Integer, Set<Integer>> itemIdVsNumberOfSessions = new HashMap<>();

    @Override
    public void process(PurchaseEvent purchaseEvent) {
        if (itemIdVsNumberOfSessions.containsKey(purchaseEvent.getItemId())) {
            itemIdVsNumberOfSessions.get(purchaseEvent.getItemId()).add(purchaseEvent.getSessionId());
        } else {
            Set<Integer> sessionId = new HashSet<>();
            sessionId.add(purchaseEvent.getSessionId());
            itemIdVsNumberOfSessions.put(purchaseEvent.getItemId(), sessionId);
        }
    }

    @Override
    public void printReport(PrintWriter printWriter) {
        for (Integer eachItemId : itemIdVsNumberOfSessions.keySet()) {
            printWriter.print(eachItemId + "=" + itemIdVsNumberOfSessions.get(eachItemId).size() + ",");
        }
        printWriter.flush();
    }
}
