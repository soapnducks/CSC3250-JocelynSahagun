package labs.lab20_Factory_II;

/** One recipe class can work with either ingredient family. */
public final class CheesePizza extends Pizza {
    private final PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        super("Cheese Pizza");
        if (ingredientFactory == null) {
            throw new IllegalArgumentException("Ingredient factory must not be null.");
        }
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        recordStep("prepare");
    }
}