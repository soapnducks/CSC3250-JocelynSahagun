package homework.hw03;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Strategy context and Observer subject for this small game. */
public class GameCharacter implements CombatSubject {
    private final String name;
    private WeaponBehavior weapon;
    private final List<CombatObserver> observers = new ArrayList<>();

    // Supplied constructor and getters. Keep them unchanged.
    public GameCharacter(String name, WeaponBehavior weapon) {
        this.name = Objects.requireNonNull(name, "name");
        this.weapon = Objects.requireNonNull(weapon, "weapon");
    }

    public String getName() { return name; }
    public WeaponBehavior getWeaponBehavior() { return weapon; }

    /** Replace the Strategy reference without attacking or notifying observers. */
    public void setWeaponBehavior(WeaponBehavior weapon) {
        Objects.requireNonNull(weapon, "weapon");
        this.weapon = weapon;
    }

    /**
     * Ask the current weapon for damage and description exactly once each.
     * Create one new AttackEvent, pass that SAME event to each registered
     * observer exactly once, and return it. Do not print inside this method.
     */
    public AttackEvent attack() {
        int damage = weapon.damage();
        String description = weapon.description();
        AttackEvent event = new AttackEvent(name, description, damage);
        for (CombatObserver observer : observers) {
            observer.update(event);
        }
        return event;
    }

    /** Register once. Re-registering the same observer does not duplicate it. */
    @Override
    public void registerObserver(CombatObserver observer) {
        Objects.requireNonNull(observer, "observer");
        if(!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    /** Remove if present. Removing a missing observer is harmless. */
    @Override
    public void removeObserver(CombatObserver observer) {
        Objects.requireNonNull(observer, "observer");
        observers.remove(observer);
    }
}