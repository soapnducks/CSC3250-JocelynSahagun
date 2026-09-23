package labs.lab06;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class ShoppingCart {

    private List<CartItem> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }


    public void addProduct(Product product, int quantity) {

        if (product == null) {
            throw new IllegalArgumentException(
                    "Product cannot be null."
            );
        }

        if (quantity <= 0) {
            throw new IllegalArgumentException(
                    "Quantity must be greater than zero."
            );
        }

        CartItem item = new CartItem(product, quantity);
        items.add(item);
        // Question:
        // Why does ShoppingCart create CartItem?
        // Because ShoppingCart is not able to store the products directly
        // cart should store, product, quantity, and calculate price and quantity.
    }


    public double getSubtotal() {

        double subtotal = 0.0;
        for (CartItem item : items) {
            subtotal += item.getLineTotal();
        }

        return subtotal;
    }


    public List<CartItem> getItems() {
        return Collections.unmodifiableList(items);
    }
}
