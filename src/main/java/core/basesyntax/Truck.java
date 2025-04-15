package core.basesyntax;

public class Truck extends Machine {
    @Override
    void doWork() {
        System.out.println("Truck start working.");
    }

    @Override
    void stopWork() {
        System.out.println("Truck finished work.");
    }
}
