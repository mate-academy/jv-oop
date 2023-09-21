package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("This Bulldozer do work");
    }

    @Override
    public void stopWork() {
        System.out.println("This Buldozer stop work");
    }
}
