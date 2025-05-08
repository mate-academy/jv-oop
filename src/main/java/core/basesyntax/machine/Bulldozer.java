package core.basesyntax.machine;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer do work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stop work");
    }
}
