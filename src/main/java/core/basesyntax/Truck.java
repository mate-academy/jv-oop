package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck: Started working. I am transporting cargo");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck: The cargo has been delivered");
    }
}
