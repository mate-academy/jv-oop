package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("The Excavator is started work");
    }

    @Override
    public void stopWork() {
        System.out.println("The Excavator is stopped work");
    }
}
