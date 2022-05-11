package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("The Truck has  started it's work");
    }

    @Override
    public void stopWork() {
        System.out.println("The Truck has  stopped it's work");
    }
}
