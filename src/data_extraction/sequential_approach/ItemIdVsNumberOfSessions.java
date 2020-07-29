package data_extraction.sequential_approach;

import data_extraction.PurchaseEvent;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemIdVsNumberOfSessions implements Report {

    @Override
    public void process(List<PurchaseEvent> purchaseEvents, PrintWriter printWriter) {
        Map<Integer, Integer> itemIdVsNumOfSession = new HashMap<>();
        Map<Integer, Map<Integer, Long>> itemIdVsSessionCount = purchaseEvents
                .stream()
                .collect(Collectors.groupingBy(PurchaseEvent::getItemId,
                        Collectors.groupingBy(PurchaseEvent::getSessionId, Collectors.counting())));
        for (Integer eachItemId : itemIdVsSessionCount.keySet()) {
            itemIdVsNumOfSession.put(eachItemId, itemIdVsSessionCount.get(eachItemId).size());
        }
        printWriter.println(itemIdVsNumOfSession);
        printWriter.flush();
    }
}
