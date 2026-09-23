package labs.lab06;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Catalog {

    private List<Product> products;

    public Catalog() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {

        if (product == null) {
            throw new IllegalArgumentException(
                    "Product cannot be null."
            );
        }

        products.add(product);
    }


    public Product findProduct(String id) {

        for (Product p : products) {
            if (p.getId().equals(id)) {
                return p;
            }
        }

        return null;
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }
}
