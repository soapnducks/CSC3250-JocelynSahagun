package labs.lab09;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class CheckoutService {
    public String deliveryLine(Product product) {
        Objects.requireNonNull(product, "product");

        return product.getName() + " -> " + product.deliveryInstructions();
    }
    public List<String> deliveryLines(ShoppingCart cart) {
        Objects.requireNonNull(cart, "cart");
        List<String> lines = new ArrayList<>();
        for (CartItem item : cart.getItems()) {
            Product product = item.getProduct();
            lines.add(deliveryLine(product));
        }

        return lines;
    }
}