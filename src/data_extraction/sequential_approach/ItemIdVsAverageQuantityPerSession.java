package data_extraction.sequential_approach;

import data_extraction.PurchaseEvent;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemIdVsAverageQuantityPerSession implements Report {

    Map<Integer, Double> itemIdVsAverageQuantityPerSession = new HashMap<>();

    @Override
    public void generate(List<PurchaseEvent> purchaseEvents, OutputStream outputStream) throws IOException {
        itemIdVsAverageQuantityPerSession = purchaseEvents
                .stream()
                .collect(Collectors.groupingBy(PurchaseEvent::getItemId,
                        Collectors.averagingDouble(PurchaseEvent::getQuantity)));
        outputStream.write(itemIdVsAverageQuantityPerSession.toString().getBytes());
        outputStream.write('\n');
    }
}
