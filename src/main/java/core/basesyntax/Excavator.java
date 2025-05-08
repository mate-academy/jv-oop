package core.basesyntax;

public class Excavator extends Machin {
    @Override
    public void doWork() {
        System.out.println("Excavator started work");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stop work");
    }
}

