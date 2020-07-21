package data_extraction.sequential_approach;

import data_extraction.PurchaseEvent;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemIdVsNumberOfSessions implements Report {

    Map<Integer, Map<Integer, Long>> itemIdVsNumberOfSession = new HashMap<>();

    @Override
    public void generate(List<PurchaseEvent> purchaseEvents, OutputStream outputStream) throws IOException {
        itemIdVsNumberOfSession = purchaseEvents
                .stream()
                .collect(Collectors.groupingBy(PurchaseEvent::getItemId,
                        Collectors.groupingBy(PurchaseEvent::getSessionId,
                                Collectors.counting())));
        outputStream.write(itemIdVsNumberOfSession.toString().getBytes());
        outputStream.write('\n');
    }
}
