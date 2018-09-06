package exercise01.designPatterns.strategy;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack that squeak");
    }
}
