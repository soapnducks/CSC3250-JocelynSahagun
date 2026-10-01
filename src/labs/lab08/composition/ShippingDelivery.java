package labs.lab08.composition;

public class ShippingDelivery extends DeliveryMethod {

    @Override
    public String instructions() {
        return "Ship to address";
    }
}