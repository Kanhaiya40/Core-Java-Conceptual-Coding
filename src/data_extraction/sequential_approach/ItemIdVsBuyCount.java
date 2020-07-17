package data_extraction.sequential_approach;

import data_extraction.PurchaseEvent;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemIdVsBuyCount implements SequentialLog<Long> {

    @Override
    public Map<Integer, Long> getData(List<PurchaseEvent> purchaseEvents) {
        return purchaseEvents
                .stream()
                .collect(Collectors.groupingBy(PurchaseEvent::getItemId, Collectors.counting()));
    }
}

