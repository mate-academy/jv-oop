package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator started to work and now it is working");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator completed all his tasks");
        System.out.println("Excavator stopped to work");
    }
}
