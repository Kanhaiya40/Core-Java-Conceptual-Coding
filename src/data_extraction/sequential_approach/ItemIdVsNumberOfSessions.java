package data_extraction.sequential_approach;

import data_extraction.Parser;
import data_extraction.PurchaseEvent;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemIdVsNumberOfSessions {

    private final List<PurchaseEvent> purchaseEvents;

    ItemIdVsNumberOfSessions(String filePath) throws IOException {
        Parser parser = new Parser(filePath);
        purchaseEvents = parser.getPurchaseEvents();
    }

    public Map<Integer, Long> getData() {
        Map<Integer, Long> itemIdVsNumberOfSession;
        itemIdVsNumberOfSession = purchaseEvents.stream().collect(Collectors.groupingBy(PurchaseEvent::getItemId, Collectors.counting()));
        return itemIdVsNumberOfSession;
    }
}
