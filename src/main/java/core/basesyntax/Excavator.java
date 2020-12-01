package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("doWork Excavator");
    }

    @Override
    public void stopWork() {
        System.out.println("stop work Excavator");
    }
}
