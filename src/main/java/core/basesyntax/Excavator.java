package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator is digging a hole");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator has stopped digging");
    }
}
