package core.basesyntax;

public class Excavator extends Machine {
    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("The excavator doing the work");
    }

    @Override
    public void stopWork() {
        System.out.println("The excavator stopped working");
    }
}
