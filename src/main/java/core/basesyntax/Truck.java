package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck started its engine and began to work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck turned off its engine and stopped working.");
    }
}
