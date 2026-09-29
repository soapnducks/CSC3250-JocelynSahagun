package homework.hw01.inventory.model;

/**
 * Represents a supplier that can provide one or more products.
 *
 * HW1 focus:
 * - Encapsulation: keep fields private.
 * - Constructor: initialize the object's state.
 * - Accessors: provide read-only access through getters.
 */
public class Supplier {

    private String supplierId;
    private String name;
    private String email;


    public Supplier(String supplierId, String name, String email) {
        this.supplierId = supplierId;
        this.name = name;
        this.email = email;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}