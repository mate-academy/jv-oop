package core.basesyntax.model;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer was started it's work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer was stopped it's work!");
    }
}
