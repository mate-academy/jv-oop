package core.basesyntax;

public class Excavator extends Machine {
    @Override
    void work() {
        System.out.println("Excavator START working");
    }

    @Override
    void stopWork() {
        System.out.println("Excavator STOP working");
    }
}
