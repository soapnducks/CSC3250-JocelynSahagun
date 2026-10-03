package homework.hw01.inventory.app;

import homework.hw01.inventory.model.Product;
import homework.hw01.inventory.model.Supplier;
import homework.hw01.inventory.service.Warehouse;

public class InventoryDemo {

    public static void main(String[] args) {

        Supplier s1 = new Supplier("S001", "TechItem", "techitem@example.com");
        Supplier s2 = new Supplier("S002", "TechGadget", "techgadget@example.com");


        Product Laptop = new Product("P100", "Laptop", 999.99, s1);
        Product Mouse = new Product("P200", "Mouse", 24.99, s2);
        Product Keyboard = new Product("P300", "Keyboard", 49.99, s1);


        Warehouse mainWarehouse = new Warehouse("Main Warehouse");

        mainWarehouse.addProduct(Laptop, 10, 3);
        mainWarehouse.addProduct(Mouse, 20, 5);
        mainWarehouse.addProduct(Keyboard, 8, 4);


        mainWarehouse.addStock("P100", 5);
        mainWarehouse.removeStock("P200", 3);
        mainWarehouse.removeStock("P300", 5);

        boolean success = mainWarehouse.removeStock("P100", 100);
        System.out.println("Attempt to remove 100 laptops: " + (success ? "Succeeded" : "Failed"));

        System.out.println("\n=== Final Inventory ===");
        mainWarehouse.displayInventory();
    }
}