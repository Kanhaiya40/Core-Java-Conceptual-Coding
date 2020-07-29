package data_extraction.sequential_approach;

import data_extraction.PurchaseEvent;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemIdVsAverageQuantityPerSession implements Report {

    @Override
    public void process(List<PurchaseEvent> purchaseEvents, PrintWriter printWriter) {
        Map<Integer, Double> itemIdVsAvgQuantityPerSession = new HashMap<>();
        Map<Integer, Map<Integer, Double>> itemIdVsSessionIdAvg;
        itemIdVsSessionIdAvg = purchaseEvents
                .stream()
                .collect(Collectors.groupingBy(PurchaseEvent::getItemId,
                        Collectors.groupingBy(PurchaseEvent::getSessionId,
                                Collectors.averagingDouble(PurchaseEvent::getQuantity))));
        purchaseEvents.stream().
                filter(purchaseEvent -> itemIdVsSessionIdAvg.containsKey(purchaseEvent.getItemId())).
                forEach(purchaseEvent -> itemIdVsAvgQuantityPerSession.put(purchaseEvent.getItemId(),
                        itemIdVsSessionIdAvg.get(purchaseEvent.getItemId()).get(purchaseEvent.getSessionId())));
        printWriter.println(itemIdVsAvgQuantityPerSession);
        printWriter.flush();

    }
}
