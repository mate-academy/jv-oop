package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator starts working");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stopped working");
    }
}
