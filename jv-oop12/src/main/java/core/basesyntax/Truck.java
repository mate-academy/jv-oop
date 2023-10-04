package core.basesyntax;

public class Truck extends Machine{
    @java.lang.Override
    public void doWork() {
        System.out.println("Truck ride");
    }

    @java.lang.Override
    public void stopWork() {
        System.out.println("Truck stop");
    }
}
