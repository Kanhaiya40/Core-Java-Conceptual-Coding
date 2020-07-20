package data_extraction.sequential_approach;

import data_extraction.PurchaseEvent;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemIdVsBuyCount implements Report {

    Map<Integer, Long> itemIdVsBuysCount = new HashMap<>();

    @Override
    public void generate(List<PurchaseEvent> purchaseEvents, OutputStream outputStream) throws IOException {
        itemIdVsBuysCount = purchaseEvents
                .stream()
                .collect(Collectors.groupingBy(PurchaseEvent::getItemId, Collectors.counting()));
        outputStream.write(itemIdVsBuysCount.toString().getBytes());
        outputStream.write('\n');
    }
}

