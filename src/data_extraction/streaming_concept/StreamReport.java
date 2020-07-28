package data_extraction.streaming_concept;

import data_extraction.PurchaseEvent;

import java.io.PrintWriter;

public interface StreamReport {

    void process(PurchaseEvent purchaseEvent);

    void printReport(PrintWriter printWriter);
}
