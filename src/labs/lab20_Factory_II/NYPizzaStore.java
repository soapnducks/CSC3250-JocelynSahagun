package labs.lab20_Factory_II;

public final class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new CheesePizza(new NYPizzaIngredientFactory());
        }
        throw new IllegalArgumentException("Unsupported pizza type: " + type);
    }
}