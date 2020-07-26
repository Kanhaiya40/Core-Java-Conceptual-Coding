package tabular_report;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class PurchaseEvent {

    private final int sessionId;
    private final LocalDateTime currentTimePeriod;
    private final int itemId;
    private final int price;
    private final int quantity;

    public PurchaseEvent(int sessionId, LocalDateTime currentTimePeriod, int itemId, int price, int quantity) {
        this.sessionId = sessionId;
        this.currentTimePeriod = currentTimePeriod;
        this.itemId = itemId;
        this.price = price;
        this.quantity = quantity;
    }

    public LocalDateTime getCurrentTimePeriod() {
        return currentTimePeriod;
    }

    public int getItemId() {
        return itemId;
    }


    public int getQuantity() {
        return quantity;
    }

    public int getSessionId() {
        return sessionId;
    }

    public DayOfWeek getDayOfWeek() {
        return getCurrentTimePeriod().getDayOfWeek();
    }

    public int getHourOfPurchaseEvent() {
        return getCurrentTimePeriod().getHour();
    }

    @Override
    public String toString() {
        return "PurchaseEvent{" +
                "sessionId=" + sessionId +
                ", currentTimePeriod=" + currentTimePeriod +
                ", itemId=" + itemId +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
