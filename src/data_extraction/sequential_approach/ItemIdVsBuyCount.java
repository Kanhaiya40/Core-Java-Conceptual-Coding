package data_extraction.sequential_approach;

import data_extraction.PurchaseEvent;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemIdVsBuyCount implements Report {

    @Override
    public void process(List<PurchaseEvent> purchaseEvents, PrintWriter printWriter) {
        Map<Integer, Long> itemIdVsBuysCount = purchaseEvents
                .stream()
                .collect(Collectors.groupingBy(PurchaseEvent::getItemId,
                        Collectors.counting()));
        printWriter.println(itemIdVsBuysCount);
        printWriter.flush();
    }
}

