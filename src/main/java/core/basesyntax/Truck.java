package core.basesyntax;

public class Truck extends Machine {
    @Override
    void work() {
        System.out.println("Truck START working");
    }

    @Override
    void stopWork() {
        System.out.println("Truck STOP working");
    }
}
