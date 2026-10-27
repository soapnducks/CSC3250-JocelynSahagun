package homework.hw02;

/** Student file 1 of 2. Complete only the marked sections. */
public class DiscountedProduct extends Product {
    private final double discountRate;

    /**
     * discountRate is a fraction: 0.25 means 25% off.
     * A valid rate is finite and between 0.0 and 1.0, inclusive.
     * Otherwise, throw IllegalArgumentException. Exception text is not graded.
     */
    public DiscountedProduct(String productId, String name,
                             double price, double discountRate) {
        // Supplied to keep the starter compilable. Do not replace inherited fields.
        super(productId, name, price);

        if (!Double.isFinite(discountRate)
                || discountRate < 0.0 || discountRate > 1.0) {
            throw new IllegalArgumentException("Discount rate must be finite and in [0.0, 1.0].");
        }
        this.discountRate = discountRate;
    }

    /** Already complete. Do not change this getter. */
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public double getPurchasePrice() {

        return getPrice()*(1.0-discountRate);
    }
}