package data_extraction.streaming_concept;

import java.util.Objects;

public class HourWiseReportData {

    private String hourOfDay;
    private double avgActiveSessionId;
    private double avgItemIdPurchased;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HourWiseReportData that = (HourWiseReportData) o;
        return hourOfDay.equals(that.hourOfDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hourOfDay);
    }

    public String getHourOfDay() {
        return hourOfDay;
    }

    public void setHourOfDay(String hourOfDay) {
        this.hourOfDay = hourOfDay;
    }

    @Override
    public String toString() {
        return "HourWiseReportData{" +
                "hourOfDay='" + hourOfDay + '\'' +
                ", avgActiveSessionId=" + avgActiveSessionId +
                ", avgItemIdPurchased=" + avgItemIdPurchased +
                '}';
    }

    public double getAvgActiveSessionId() {
        return avgActiveSessionId;
    }

    public void setAvgActiveSessionId(double avgActiveSessionId) {
        this.avgActiveSessionId = avgActiveSessionId;
    }

    public double getAvgItemIdPurchased() {
        return avgItemIdPurchased;
    }

    public void setAvgItemIdPurchased(double avgItemIdPurchased) {
        this.avgItemIdPurchased = avgItemIdPurchased;
    }
}
