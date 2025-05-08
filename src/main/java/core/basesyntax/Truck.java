package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck started to transport goods.");
    }

    public void stopWork() {
        System.out.println("Truck finished transportation of goods.");
    }
}
