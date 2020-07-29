package data_extraction.sequential_approach;

import data_extraction.PurchaseEvent;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

public interface Report {

    void process(List<PurchaseEvent> purchaseEvents, PrintWriter printWriter) throws IOException;

}
