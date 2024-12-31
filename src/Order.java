import java.util.ArrayList;
import java.util.List;

public class Order {
    public static final String ORDER_ID_PREFIX = "ORD";
    private final String orderId;
    private final String customerId;
    private String item;
    private int quantity;
    private double price;

    // 1. Overloaded constructor with all parameters
    public Order(String orderId, String customerId, String item, int quantity, double price) {
        this.orderId = ORDER_ID_PREFIX + orderId;
        this.customerId = customerId;
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }

    // non-overridable constructor
    public final String getOrderId() {
        return orderId;
    }

    public double getPrice() {  // Added getter for price
        return price;
    }
}

