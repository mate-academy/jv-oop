package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Machine Bulldozer has started");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine Bulldozer has stopped it's work");
    }
}
