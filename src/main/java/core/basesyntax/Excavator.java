package core.basesyntax;

public class Excavator extends Machine {
    public Excavator() {
        super();
    }

    @Override
    public void doWork() {
        System.out.println("Excavator is working");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stopped working");
    }
}
