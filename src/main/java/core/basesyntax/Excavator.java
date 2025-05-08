package core.basesyntax;

public class Excavator extends Machine {
    public void doWork() {
        System.out.println("Excavator is working right now.");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stopped its work.");
    }
}
