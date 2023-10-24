package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("The excavator started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("The excavator stopped its work");
    }
}
