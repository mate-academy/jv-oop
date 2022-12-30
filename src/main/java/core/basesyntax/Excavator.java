package core.basesyntax;

public class Excavator extends Machine {
    public void doWork() {
        System.out.println("Excavator stated work");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stopped work");
    }
}
