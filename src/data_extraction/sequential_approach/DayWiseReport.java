package data_extraction.sequential_approach;

import data_extraction.PurchaseEvent;

import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Problem Statement-1:Print a tabular report of (day of week, item id, avg quantity purchased)
 * <p>
 * Sample Input:
 * 420374,2014-04-06T18:44:58.314Z,214537888,12462,3
 * 420374,2014-04-06T18:44:58.325Z,214537888,10471,2
 * 281626,2014-04-06T09:40:13.032Z,214535653,1883,2
 * 420368,2014-04-04T06:13:28.848Z,214537888,6073,1
 * 420368,2014-04-04T06:13:28.858Z,214535653,2617,3
 * <p>
 * Sample Output:
 * DayOfWeek		ItemId			AvgQuaPurchased
 * FRIDAY			214537888			1.0
 * FRIDAY			214535653			3.0
 * SUNDAY			214537888			2.5
 * SUNDAY			214535653			2.0
 */
public class DayWiseReport implements Report {


    @Override
    public void process(List<data_extraction.PurchaseEvent> purchaseEvents, PrintWriter printWriter) {
        Map<DayOfWeek, Map<Integer, Double>> dayWiseReports = purchaseEvents
                .stream()
                .collect(Collectors.groupingBy(PurchaseEvent::getDayOfWeek,
                        Collectors.groupingBy(PurchaseEvent::getItemId,
                                Collectors.averagingDouble(PurchaseEvent::getQuantity))));
        printWriter.println("DayOfWeek\t" +
                "" + "ItemId\t" + "AvgQuaPurchased ");
        for (DayOfWeek eachDayOfPurchase : dayWiseReports.keySet()) {
            for (Integer eachItemId : dayWiseReports.get(eachDayOfPurchase).keySet()) {
                printWriter.println(eachDayOfPurchase + "\t" + eachItemId + "\t" + dayWiseReports.get(eachDayOfPurchase).get(eachItemId));
                printWriter.flush();
            }
        }
    }
}
