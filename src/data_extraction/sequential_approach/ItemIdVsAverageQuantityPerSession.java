package data_extraction.sequential_approach;

import data_extraction.PurchaseEvent;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemIdVsAverageQuantityPerSession implements Report {

    @Override
    public void generate(List<PurchaseEvent> purchaseEvents, OutputStream outputStream) throws IOException {
        Map<Integer, Double> item = new HashMap<>();
        Map<Integer, Map<Integer, Double>> itemIdVsAverageQuantityPerSession;
        itemIdVsAverageQuantityPerSession = purchaseEvents.stream().collect(Collectors.groupingBy(PurchaseEvent::getItemId, Collectors.groupingBy(PurchaseEvent::getSessionId, Collectors.averagingDouble(PurchaseEvent::getQuantity))));
        purchaseEvents.stream().filter(purchaseEvent -> itemIdVsAverageQuantityPerSession.containsKey(purchaseEvent.getItemId())).forEach(purchaseEvent -> item.put(purchaseEvent.getItemId(), itemIdVsAverageQuantityPerSession.get(purchaseEvent.getItemId()).get(purchaseEvent.getSessionId())));
        outputStream.write(item.toString().getBytes());
        outputStream.write('\n');
    }
}
