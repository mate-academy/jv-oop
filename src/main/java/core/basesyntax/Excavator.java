package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator: Started digging");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator: Finished digging");
    }
}
