package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator start doing his work");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stop doing his work \n");
    }
}
