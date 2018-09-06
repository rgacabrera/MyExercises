package exercise01.designPatterns.strategy;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("No flying...");
    }
}
