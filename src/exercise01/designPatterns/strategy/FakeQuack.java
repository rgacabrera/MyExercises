package exercise01.designPatterns.strategy;

public class FakeQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Qwak!!!");
    }
}
