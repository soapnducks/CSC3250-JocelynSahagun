package homework.hw01.inventory.model;

/**
 * Represents one product entry inside a warehouse inventory.
 *
 * An InventoryItem stores:
 * - the Product being tracked,
 * - the current quantity,
 * - the reorder level.
 *
 * The class is responsible for protecting its quantity from invalid changes.
 */
public class InventoryItem {

    private Product product;
    private int quantity;
    private int reorderLevel;

    /**
     *
     * For this homework, Warehouse.addProduct(...) is responsible for
     * checking the initial quantity and reorder level before constructing
     * an InventoryItem.
     */
    public InventoryItem(Product product, int quantity, int reorderLevel) {
        this.product = product;
        this.quantity = quantity;
        this.reorderLevel = reorderLevel;
    }


    public Product getProduct() {
        return product;
    }


    public int getQuantity() {
        return quantity;
    }


    public int getReorderLevel() {
        return reorderLevel;
    }

    /**
     * Adds stock to this item.
     *
     * Contract:
     * - amount must be greater than 0.
     * - if amount <= 0, do not change quantity and return false.
     * - otherwise, increase quantity and return true.
     */
    public boolean addStock(int amount) {
       if (amount > 0) {
           quantity += amount;
           return true;
       }
        return false;
    }

    /**
     * Removes stock from this item.
     *
     * Contract:
     * - amount must be greater than 0.
     * - amount cannot be greater than the current quantity.
     * - on invalid input, do not change quantity and return false.
     * - otherwise, decrease quantity and return true.
     */
    public boolean removeStock(int amount) {
        if (amount > 0 && amount <= quantity) {
            quantity -= amount;
            return true;
        }
        return false;
    }

    /**
     * Returns true when the item should be reordered.
     *
     * Required rule for HW1:
     * quantity <= reorderLevel
     */
    public boolean needsReorder() {
        return quantity <= reorderLevel;
    }
}