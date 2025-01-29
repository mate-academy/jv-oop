package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Truck is ready to work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck is finish work");
    }
}
