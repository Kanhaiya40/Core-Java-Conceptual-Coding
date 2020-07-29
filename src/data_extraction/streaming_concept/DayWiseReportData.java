package data_extraction.streaming_concept;

import java.time.DayOfWeek;
import java.util.Objects;

public class DayWiseReportData {

    private DayOfWeek dayOfWeek;
    private int itemId;
    private double avgQuantityPurchased;

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DayWiseReportData that = (DayWiseReportData) o;
        return itemId == that.itemId &&
                dayOfWeek == that.dayOfWeek;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dayOfWeek, itemId);
    }

    @Override
    public String toString() {
        return "DayWiseReportData{" +
                "dayOfWeek=" + dayOfWeek +
                ", itemId=" + itemId +
                ", avgQuantityPurchased=" + avgQuantityPurchased +
                '}';
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public double getAvgQuantityPurchased() {
        return avgQuantityPurchased;
    }

    public void setAvgQuantityPurchased(double avgQuantityPurchased) {
        this.avgQuantityPurchased = avgQuantityPurchased;
    }
}
