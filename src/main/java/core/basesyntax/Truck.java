package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck started!");
    }

    @Override
    public void stopWorked() {
        System.out.println("Truck stopped!");
    }
}