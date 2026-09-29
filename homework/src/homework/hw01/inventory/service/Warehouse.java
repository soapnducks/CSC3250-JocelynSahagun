package homework.hw01.inventory.service;

import homework.hw01.inventory.model.InventoryItem;
import homework.hw01.inventory.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a warehouse that owns and manages its inventory items.
 *
 * HW1 design focus:
 * - The internal inventory list must remain private.
 * - Warehouse.addProduct(...) creates InventoryItem objects.
 * - Outside code should not directly modify the inventory list.
 */
public class Warehouse {

    private String name;
    private List<InventoryItem> inventory;


    public Warehouse(String name) {
        this.name = name;
        this.inventory = new ArrayList<>();
    }


    public String getName() {
        return name;
    }


    public List<InventoryItem> getInventory() {
        return Collections.unmodifiableList(inventory);
    }

    public boolean addProduct(Product product, int quantity, int reorderLevel) {
        if (product == null || quantity < 0 || reorderLevel < 0) {
            return false;
        }
        if (findItem(product.getProductId()) != null) {
            return false;
        }

        InventoryItem item = new InventoryItem(product, quantity, reorderLevel);
            inventory.add(item);
            return true;
    }

    /**
     * Finds an inventory item by product ID.
     *
     * Contract:
     * - return the matching InventoryItem when found;
     * - return null when no match exists.
     */
    public InventoryItem findItem(String productId) {
        for (InventoryItem item : inventory) {
            if (item.getProduct().getProductId().equals(productId)) {
                return item;
            }
        }
        return null;
    }

    /**
     * Adds stock to an existing product.
     *
     * Contract:
     * - if productId does not exist, return false;
     * - otherwise delegate the work to InventoryItem.addStock(amount).
     */
    public boolean addStock(String productId, int amount) {
        InventoryItem item = findItem(productId);
        return item != null && item.addStock(amount);
}
    /**
     * Removes stock from an existing product.
     *
     * Contract:
     * - if productId does not exist, return false;
     * - otherwise delegate the work to InventoryItem.removeStock(amount).
     */
    public boolean removeStock(String productId, int amount) {
        InventoryItem item = findItem(productId);
        return item != null && item.removeStock(amount);
    }

    /**
     * Displays each product in the warehouse.
     *
     * Minimum information to print for each item:
     * - product ID
     * - product name
     * - quantity
     * - reorder level
     * - whether reorder is needed
     */
    public void displayInventory() {
        System.out.println("Inventory for " + name + ":");
        for (InventoryItem item : inventory) {
            System.out.println(item.getProduct().getName() +
                    " | Qty: " + item.getQuantity() +
                    " | Reorder Level: " + item.getReorderLevel() +
                    " | Needs Reorder? " + item.needsReorder());
        }
        // TODO: loop through inventory and print the required information.
    }
}