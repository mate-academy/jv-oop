package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Machine \"Excavator\" started work");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine \"Excavator\" stopped work");
    }
}
