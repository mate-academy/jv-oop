package core.basesyntax;

public class Excavator extends Machines {
    @Override
    public void doWork() {
        System.out.println("Excavator strted it's work");
    }
    @Override
    public void stopWork() {
        System.out.println("Excavator stop it's work");
    }
}
