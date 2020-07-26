package tabular_report;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public interface TabularReport {

    void generate(List<PurchaseEvent> purchaseEvents, PrintWriter printWriter) throws IOException;
}
