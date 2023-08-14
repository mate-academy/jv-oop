package core.basesyntax;

public class Truck extends Machine {
    @Override
    void doWork() {
        System.out.println("Truck started to work");
    }
    @Override
    void stopWork() {
        System.out.println("Truck stopped to work");
    }
}
