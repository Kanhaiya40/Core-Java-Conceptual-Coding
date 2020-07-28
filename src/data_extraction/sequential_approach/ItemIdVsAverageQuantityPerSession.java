package data_extraction.sequential_approach;

import data_extraction.PurchaseEvent;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemIdVsAverageQuantityPerSession implements Report {

    @Override
    public void generate(List<PurchaseEvent> purchaseEvents, PrintWriter printWriter) {
        Map<Integer, Double> itemIdVsAvgQuantPerSession = new HashMap<>();
        Map<Integer, Map<Integer, Double>> itemIdVsSesionIdAvg;
        itemIdVsSesionIdAvg = purchaseEvents
                .stream()
                .collect(Collectors.groupingBy(PurchaseEvent::getItemId,
                        Collectors.groupingBy(PurchaseEvent::getSessionId,
                                Collectors.averagingDouble(PurchaseEvent::getQuantity))));
        purchaseEvents.stream().
                filter(purchaseEvent -> itemIdVsSesionIdAvg.containsKey(purchaseEvent.getItemId())).
                forEach(purchaseEvent -> itemIdVsAvgQuantPerSession.put(purchaseEvent.getItemId(),
                        itemIdVsSesionIdAvg.get(purchaseEvent.getItemId()).get(purchaseEvent.getSessionId())));
        printWriter.println(itemIdVsAvgQuantPerSession);
        printWriter.flush();

    }
}
