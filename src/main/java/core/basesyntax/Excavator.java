package core.basesyntax;

public class Excavator extends Machine{
    @Override
    public void doWork() {
        System.out.println("Excavator has started his work");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator has stopped his work");
    }
}
