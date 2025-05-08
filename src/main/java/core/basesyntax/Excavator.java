package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator starts doing it`s work");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stops doing it`s work");
    }
}
