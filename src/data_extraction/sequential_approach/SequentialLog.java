package data_extraction.sequential_approach;

import data_extraction.PurchaseEvent;

import java.util.List;
import java.util.Map;

public interface SequentialLog<T> {
    Map<Integer, T> getData(List<PurchaseEvent> purchaseEvents);
}
