package labs.lab20_Factory_II;

/** Abstract Factory: the operations that every regional family supplies. */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
}