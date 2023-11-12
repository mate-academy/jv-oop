package core.basesyntax;

public class Excavator implements Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator working");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stopped");
    }
}
