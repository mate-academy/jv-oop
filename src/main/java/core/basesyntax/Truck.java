package core.basesyntax;

public class Truck extends Machine {
    @java.lang.Override
    public void doWork() {
        System.out.println("Truck started it's work");
    }

    @java.lang.Override
    public void stopWork() {
        System.out.println("Truck stopped it's work");
    }
}
