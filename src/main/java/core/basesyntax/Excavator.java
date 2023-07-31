package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void doWork() {
        System.out.println("Excavator start work");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stop work");
    }
}
