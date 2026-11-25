package homework.hw03;

/** A concrete Decorator.*/
public class PowerWeapon extends WeaponDecorator {
    // Supplied constructor. Keep it unchanged.
    public PowerWeapon(WeaponBehavior wrapped) {
        super(wrapped);
    }

    @Override
    public int damage() {
        return wrapped.damage() * 2;
    }

    @Override
    public String description() {
        return wrapped.description() + " x2";
    }
}