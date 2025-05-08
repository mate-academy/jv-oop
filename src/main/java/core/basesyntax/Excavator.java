package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("excavator start working");
    }

    @Override
    public void stopWork() {
        System.out.println("excavator stoped work");
    }
}
