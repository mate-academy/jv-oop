package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        super.doWork();
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped work");
    }
}
