package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excalator started working");
    }

    @Override
    public void stopWork() {
        System.out.println("Excalator stopped working");
    }
}
