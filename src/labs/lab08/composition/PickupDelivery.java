package labs.lab08.composition;

public class PickupDelivery extends DeliveryMethod {
    private final String location;

    public PickupDelivery(String location) {
        if (location == null || location.isBlank()) {
            throw new IllegalArgumentException("location cannot be blank");
        }
        this.location = location;
    }

    @Override
    public String instructions() {

        return "Pick up at " + location;
    }
}