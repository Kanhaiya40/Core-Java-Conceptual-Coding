package data_extraction.sequential_approach;

import data_extraction.PurchaseEvent;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemIdVsNumberOfSessions implements Report {

    @Override
    public void generate(List<PurchaseEvent> purchaseEvents, OutputStream outputStream) throws IOException {

        Map<Integer, Map<Integer, Long>> itemIdVsNumberOfSessionId;
        Map<Integer, Integer> item = new HashMap<>();
        itemIdVsNumberOfSessionId = purchaseEvents.stream().collect(Collectors.groupingBy(PurchaseEvent::getItemId, Collectors.groupingBy(PurchaseEvent::getSessionId, Collectors.counting())));
        for (Integer eachItemId : itemIdVsNumberOfSessionId.keySet()) {
            item.put(eachItemId, itemIdVsNumberOfSessionId.get(eachItemId).size());
        }
        outputStream.write(item.toString().getBytes());
        outputStream.write('\n');
    }
}
