package labs.lab19_Factory_I;

public final class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        super("Chicago Style Cheese Pizza");
    }

    @Override
    public void cut() {
        recordStep("cut: square slices");
    }
}