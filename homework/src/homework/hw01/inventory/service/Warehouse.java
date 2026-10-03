package homework.hw01.inventory.service;

import homework.hw01.inventory.model.InventoryItem;
import homework.hw01.inventory.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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


    public InventoryItem findItem(String productId) {
        for (InventoryItem item : inventory) {
            if (item.getProduct().getProductId().equals(productId)) {
                return item;
            }
        }
        return null;
    }

    public boolean addStock(String productId, int amount) {
        InventoryItem item = findItem(productId);
        if (item == null) {
            return false;
        }
        return item.addStock(amount);
}

    public boolean removeStock(String productId, int amount) {
        InventoryItem item = findItem(productId);
        if (item == null) {
            return false;
        }
        return item.removeStock(amount);
    }


    public void displayInventory() {
        System.out.println("Inventory for " + name + ":");
        for (InventoryItem item : inventory) {
            System.out.println(item.getProduct().getProductId() +
                    " - " + item.getProduct().getName() +
                    " | Qty: " + item.getQuantity() +
                    " | Reorder Level: " + item.getReorderLevel() +
                    " | Needs Reorder? " + item.needsReorder());
        }
    }
}