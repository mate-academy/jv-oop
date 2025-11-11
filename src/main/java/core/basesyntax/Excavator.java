package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator begins its job...");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator ends its job...");
    }
}
