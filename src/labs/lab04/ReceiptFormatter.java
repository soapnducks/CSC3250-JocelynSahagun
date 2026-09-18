package labs.lab04;

import java.util.Locale;

public class ReceiptFormatter {

    public String format(Order order) {
        StringBuilder receipt = new StringBuilder("CHECKOUT\n");

        for (OrderItem item : order.getItems()) {
            receipt.append(String.format(
                    Locale.US,
                    "%-2s %2d Price: $%.2f Total:$%.2f\n",
                    item.getName(),
                    item.getQuantity(),
                    item.getUnitPrice(),
                    item.getLineTotal()
            ));


        }
        receipt.append(String.format("Subtotal: $%.2f\n", order.getSubtotal()));
        // 1. Begin with "CHECKOUT" and a line break.
        // 2. Add one formatted line for every OrderItem.
        // 3. Add the formatted subtotal.
        // 4. Return the completed String.
        return receipt.toString();
    }
}