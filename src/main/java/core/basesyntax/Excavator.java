package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator started working. Engine OK, Fuel OK!");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stopped working. Engine OK, Out of fuel!");
    }
}
