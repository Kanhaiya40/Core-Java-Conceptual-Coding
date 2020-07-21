package data_extraction.sequential_approach;

import data_extraction.PurchaseEvent;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public interface Report {

    void generate(List<PurchaseEvent> purchaseEvents, OutputStream outputStream) throws IOException;
}
