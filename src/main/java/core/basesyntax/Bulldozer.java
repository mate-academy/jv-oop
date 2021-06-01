package core.basesyntax;

public abstract class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("This Bulldozer started work");
    }
    @Override
    public void stopWork() {
        System.out.println("This Bulldozer stopped work!");
    }
}
