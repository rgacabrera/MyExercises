package exercise01.designPatterns.strategy;

public class ReadheadDuck extends Duck {
    public ReadheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
