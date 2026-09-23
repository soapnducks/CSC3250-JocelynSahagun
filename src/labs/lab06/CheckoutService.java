package labs.lab06;

public class CheckoutService {

    public double checkout(ShoppingCart cart) {

        if (cart == null) {
            throw new IllegalArgumentException(
                    "Shopping cart cannot be null."
            );
        }

        return cart.getSubtotal();
    }
}
