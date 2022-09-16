package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println(getName() + " started working");
    }

    @Override
    public void stopWork() {
        System.out.println(getName() + " stopped working");
    }
}
