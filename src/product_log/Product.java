package product_log;

public class Product {

    private int sessionId;
    private String currentTimePeriod;
    private int itemId;
    private int price;
    private int quantity;

    public Product(int sessionId, String currentTimePeriod, int itemId, int price, int quantity) {
        this.sessionId = sessionId;
        this.currentTimePeriod = currentTimePeriod;
        this.itemId = itemId;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "sessionId=" + sessionId +
                ", currentTimePeriod=" + currentTimePeriod +
                ", itemId=" + itemId +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
