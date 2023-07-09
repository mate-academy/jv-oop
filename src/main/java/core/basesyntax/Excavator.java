package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public char doWork() {
        System.out.println("Excavator started its work");
        return 0;
    }

    @Override
    public char stopWork() {
        System.out.println("Excavator stopped its work");
        return 0;
    }
}
