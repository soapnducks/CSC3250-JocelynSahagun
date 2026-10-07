package labs.lab10.candidates;
import labs.lab10.Product;
/** Deliberately defective candidate; the original WorkshopProduct is unchanged. */
public class CandidateWorkshopProduct extends Product {
    private final String room;
    private boolean roomConfirmed;
    public CandidateWorkshopProduct(String id, String name, double price, String room) {
        super(id, name, price);
        if (room == null || room.isBlank())
            throw new IllegalArgumentException("Room required");
        this.room = room;
    }
    public void confirmRoom() { roomConfirmed = true; }
    @Override public String deliveryInstructions() {

        return "Attend in " + room;
    }
}