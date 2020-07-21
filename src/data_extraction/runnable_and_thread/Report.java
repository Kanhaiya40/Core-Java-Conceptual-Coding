package data_extraction.runnable_and_thread;

import data_extraction.PurchaseEvent;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public interface Report {
    void generate(List<PurchaseEvent> purchaseEvents, OutputStream outputStream) throws IOException;
}
