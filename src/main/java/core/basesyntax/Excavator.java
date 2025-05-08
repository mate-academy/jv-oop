package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator is digging or lifting materials.");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator has stopped digging or lifting materials.");
    }
}
