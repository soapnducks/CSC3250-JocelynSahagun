package labs.lab07;

public class PhysicalProduct extends Product {

    public PhysicalProduct(String id, String name, double price) {

         /*
         * Question:
         * Why do we need super(...) here?
         * to pass id, name, and price to product
         */
        super(id, name, price);
    }

    @Override
    public String deliveryInstructions() {

        return "Ship to address";
    }

    @Override
    public String description() {

        return super.description() + " [physical]";
    }
}