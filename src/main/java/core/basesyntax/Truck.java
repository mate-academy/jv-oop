package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck is work");
    }

    public void stopWork() {
        System.out.println("Truck isn't work");
    }
}
