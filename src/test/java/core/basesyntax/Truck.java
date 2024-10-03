package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("The " + getName() + " began its work.");

    }

    @Override
    public void stopWork() {
        System.out.println("The " + getName() + " has finished its work.");

    }
}
