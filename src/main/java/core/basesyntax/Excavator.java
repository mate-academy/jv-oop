package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("The Excavator has  started it's work");
    }

    @Override
    public void stopWork() {
        System.out.println("The Excavator has  stopped it's work");
    }
}
