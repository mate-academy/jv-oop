package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println(this.getClass().getSimpleName() + " is digging.");
    }

    @Override
    public void stopWork() {
        System.out.println(this.getClass().getSimpleName() + " has stop to dig.");
    }
}
