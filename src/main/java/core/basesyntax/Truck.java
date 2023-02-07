package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck starting it's work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck ended it's work");
    }
}
