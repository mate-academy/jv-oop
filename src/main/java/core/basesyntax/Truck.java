package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck started working. Engine OK, Wheels OK, Fuel OK!");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped working. Engine OK, Low tire pressure, Out of fuel!");
    }
}
