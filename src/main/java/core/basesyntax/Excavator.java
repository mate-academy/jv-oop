package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator started it's work");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator finished it's work");
    }

}
