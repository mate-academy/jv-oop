package core.basesyntax;

public class Excavator extends Machine {
    @Override
    void doWork() {
        System.out.println("Excavator start work");

    }

    @Override
    void stopWork() {
        System.out.println("Excavator stop work");

    }
}
