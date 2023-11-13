package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator is starting its work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator has finished its work.");
    }
}

