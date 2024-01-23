package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck started working");
    }

    @Override
    public void endWork() {
        System.out.println("Truck stopped working");
    }
}
