package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Truck was started to work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck was stopped to work");
    }
}
