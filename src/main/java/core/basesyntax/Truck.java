package core.basesyntax;

public class Truck extends Machine {

    @Override
    void doWork() {
        System.out.println("Truck start work");

    }

    @Override
    void stopWork() {
        System.out.println("Truck stop work");

    }
}
