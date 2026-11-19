package labs.lab19_Factory_I;

public final class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        }
        else {
            throw new IllegalArgumentException("Unknown pizza type: " + type);
        }
    }
}