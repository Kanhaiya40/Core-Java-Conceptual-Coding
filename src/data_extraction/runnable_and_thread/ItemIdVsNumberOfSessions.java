package data_extraction.runnable_and_thread;

import data_extraction.PurchaseEvent;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemIdVsNumberOfSessions implements Report, Runnable {

    @Override
    public void run() {
    }

    @Override
    public void generate(List<PurchaseEvent> purchaseEvents, OutputStream outputStream) throws IOException {
        Map<Integer, Map<Integer, Long>> itemIdVsNumberOfSession = purchaseEvents
                .stream()
                .collect(Collectors.groupingBy(PurchaseEvent::getItemId,
                        Collectors.groupingBy(PurchaseEvent::getSessionId, Collectors.counting())));
        outputStream.write(itemIdVsNumberOfSession.toString().getBytes());
        outputStream.write('\n');
    }
}
