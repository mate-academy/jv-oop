package core.basesyntax;

public class Excavator extends Machine {

    @Override
    void doWork() {
        System.out.println("Excavator started work");
    }

    @Override
    void stopWork() {
        System.out.println("Excavator stopped working");
    }
}
