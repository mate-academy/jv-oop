package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator start to do job");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator finished job");
    }
}
