// CSC-3250 classroom adaptation of the SimUDuck / Weather-O-Rama examples.
// Conceptual source: Freeman & Robson, Head First Design Patterns, 2nd ed.
// Original classroom scaffolding and visible checks; no external libraries required.
package labs.lab14_simuduck.starter;

public abstract class Duck {
    // Classroom visibility choice: subclasses initialize their defaults.
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    public abstract void display();

    public void swim() {
        System.out.println("Swimming");
    }
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    public void setFlyBehavior(FlyBehavior behavior) {
        if (behavior == null) throw new IllegalArgumentException("Flight behavior is required");
        this.flyBehavior = behavior;
    }
    public void setQuackBehavior(QuackBehavior behavior) {
        if (behavior == null) throw new IllegalArgumentException("Sound behavior is required");
        this.quackBehavior = behavior;
    }
}