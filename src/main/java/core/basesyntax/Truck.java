package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Truck work");
    }

    @Override
    public void spotWork() {
        System.out.println("Truck stops work");
    }
}
