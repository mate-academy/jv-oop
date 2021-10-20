package core.basesyntax.models;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer started doing work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped doing work.");
    }
}
