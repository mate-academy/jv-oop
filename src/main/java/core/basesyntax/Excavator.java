package core.basesyntax;

public class Excavator extends Machine{
    @Override
    public void doWork() {
        System.out.println("Truck started its work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped its work.");
    }
}

