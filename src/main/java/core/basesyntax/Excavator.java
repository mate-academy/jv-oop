package core.basesyntax;
public class Excavator extends Machine {
    public Excavator() {
    }
    @Override
    public void doWork() {
        System.out.println("Excavator started it`s work");
    }
    @Override
    public void stopWork() {
        System.out.println("Excavator stopped it`s work");
    }
}
