package labs.lab20_Factory_II;

public final class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new CheesePizza(new ChicagoPizzaIngredientFactory());
        }
        throw new IllegalArgumentException("Unsupported pizza type: " + type);
    }
}