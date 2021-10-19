package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Truck was started work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck did not work");
    }
}
