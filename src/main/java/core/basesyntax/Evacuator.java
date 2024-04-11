package core.basesyntax;

public class Evacuator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Evacuator start work");
    }
    @Override
    public void stopWork() {
        System.out.println("Evacuator stop work");
    }
}
