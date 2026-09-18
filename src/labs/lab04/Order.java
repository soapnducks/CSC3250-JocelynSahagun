package labs.lab04;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<OrderItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        if (item == null) {
            throw new IllegalArgumentException(
                    "Order item cannot be null."
            );
        }

        items.add(item);
    }

    public List<OrderItem> getItems() {
        return List.copyOf(items);
    }

    public double getSubtotal() {
        double subtotal = 0.0;

        for (OrderItem item : items) {
            subtotal += item.getLineTotal();
        }

        return subtotal;
    }
}
