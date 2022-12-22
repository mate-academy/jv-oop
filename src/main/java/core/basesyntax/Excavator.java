package core.basesyntax;

public class Excavator extends Machine{
    @java.lang.Override
    public void doWork() {
        System.out.println("Excavator started it's work");
    }

    @java.lang.Override
    public void stopWork() {
        System.out.println("Excavator stopped it's work");
    }
}
