// CSC-3250 classroom adaptation of the SimUDuck / Weather-O-Rama examples.
// Conceptual source: Freeman & Robson, Head First Design Patterns, 2nd ed.
// Original classroom scaffolding and visible checks; no external libraries required.
package labs.lab14_simuduck.starter;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override public void display() { System.out.println("Mallard appearance"); }
}