package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Driving an excavator do Work");
    }

    @Override
    public void stopWork() {
        System.out.println("Driving an excavator stop Work");
    }
}
