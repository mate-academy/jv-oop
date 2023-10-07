package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Truck is start work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck is stop work");
    }
}
