package data_extraction.runnable_and_thread;

import data_extraction.PurchaseEvent;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemIdVsBuyCount implements Report, Runnable {


    @Override
    public void run() {

    }

    @Override
    public void generate(List<PurchaseEvent> purchaseEvents, OutputStream outputStream) throws IOException {
        Map<Integer, Long> itemIdVsBuysCount = purchaseEvents
                .stream()
                .collect(Collectors.groupingBy(PurchaseEvent::getItemId, Collectors.counting()));
        outputStream.write(itemIdVsBuysCount.toString().getBytes());
        outputStream.write('\n');
    }
}
