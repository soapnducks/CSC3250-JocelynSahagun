package homework.hw01.inventory.model;


public class InventoryItem {

    private Product product;
    private int quantity;
    private int reorderLevel;


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


    public boolean addStock(int amount) {
       if (amount > 0) {
           quantity += amount;
           return true;
       }
        return false;
    }


    public boolean removeStock(int amount) {
        if (amount > 0 && amount <= quantity) {
            quantity -= amount;
            return true;
        }
        return false;
    }


    public boolean needsReorder() {
        return quantity <= reorderLevel;
    }
}