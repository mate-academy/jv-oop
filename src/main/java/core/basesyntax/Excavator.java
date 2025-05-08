package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Work was started by an excavator.");
    }

    @Override
    public void stopWork() {
        System.out.println("Work was stopped by an excavator.");
    }
}
