package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Machine - truck started working");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine - truck stopped working");
    }
}
