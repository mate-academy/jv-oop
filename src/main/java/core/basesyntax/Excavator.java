package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Work excavator");
    }

    @Override
    public void stopWork() {
        System.out.println("Stop worked excavator");
    }
}
