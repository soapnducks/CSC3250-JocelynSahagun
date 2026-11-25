package homework.hw03;

/** A concrete Decorator.*/
public class FireWeapon extends WeaponDecorator {
    // Supplied constructor. Keep it unchanged.
    public FireWeapon(WeaponBehavior wrapped) {
        super(wrapped);
    }

    @Override
    public int damage() {
        return wrapped.damage() + 4;
    }

    @Override
    public String description() {

        return wrapped.description() + " + fire";
    }
}