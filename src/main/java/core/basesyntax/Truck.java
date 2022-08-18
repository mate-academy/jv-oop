package core.basesyntax;

public class Truck extends Machine{
    @Override
    public void doWork() {
        System.out.println("run Truck");
    }
    @Override
    public void stopWork() {
        System.out.println("stop Truck");
    }
}
