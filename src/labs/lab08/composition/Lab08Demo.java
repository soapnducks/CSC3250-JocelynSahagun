package labs.lab08.composition;

public class Lab08Demo {
    public static void main(String[] args) {
        Product notebook = new Product(
                "P100",
                "Notebook",
                20.0,
                new ShippingDelivery()
        );

        Product guide = new Product(
                "D200",
                "Java Guide",
                15.0,
                new DownloadDelivery("guide.pdf")
        );

        System.out.println(notebook.getName() + ": " + notebook.deliveryInstructions());
        System.out.println(guide.getName() + ": " + guide.deliveryInstructions());

        CartItem notebookItem = new CartItem(notebook, 2);
        CartItem guideItem = new CartItem(guide, 3);

        System.out.println("Notebook line total: $" + notebookItem.getLineTotal());
        System.out.println("Guide line total: $" + guideItem.getLineTotal());

        Product pickupNotebook = new Product (
                "P300",
                "Pickup Notebook",
                20.0,
                new PickupDelivery("Student Center")
        );
        System.out.println(pickupNotebook.getName() + pickupNotebook.deliveryInstructions());

    }
}