package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("The truck is starting");
    }

    @Override
    public void stopWork() {
        System.out.println("The truck is finishing work");
    }
}
