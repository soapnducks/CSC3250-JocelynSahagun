package homework.hw01.inventory.model;

/**
 * Represents a product sold or stored by the warehouse.
 *
 * A Product refers to a Supplier. The Supplier can exist independently
 * of this Product, so this relationship is used as the aggregation /
 * association example in HW1.
 */
public class Product {

    private String productId;
    private String name;
    private double price;
    private Supplier supplier;


    public Product(String productId, String name, double price, Supplier supplier) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.supplier = supplier;
    }


    public String getProductId() {
        return productId;
    }


    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }


    public Supplier getSupplier() {
        return supplier;
    }
}