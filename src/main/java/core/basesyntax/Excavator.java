package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavatore starts...");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavatore stops...");
    }
}
