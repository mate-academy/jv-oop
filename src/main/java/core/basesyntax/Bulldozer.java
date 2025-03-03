package core.basesyntax;

public abstract class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer starts its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stops its work");
    }
}
