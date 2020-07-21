package data_extraction.runnable_and_thread;

import data_extraction.PurchaseEvent;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemIdVsAverageQuantityPerSession implements Report, Runnable {


    @Override
    public synchronized void run() {
    }

    @Override
    public void generate(List<PurchaseEvent> purchaseEvents, OutputStream outputStream) throws IOException {
        Map<Integer, Double> itemIdVsAverageQuantityPerSession = purchaseEvents
                .stream()
                .collect(Collectors.groupingBy(PurchaseEvent::getItemId,
                        Collectors.averagingDouble(PurchaseEvent::getQuantity)));
        outputStream.write(itemIdVsAverageQuantityPerSession.toString().getBytes());
        outputStream.write('\n');
    }
}
