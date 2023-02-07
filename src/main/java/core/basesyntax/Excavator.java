package core.basesyntax;

public class Excavator extends Machine {
    @Override public void doWork() {
        System.out.println("Excavator started its work");
    }

    public void stopWork() {
        System.out.println("Truck stopped its work");
    }
}
