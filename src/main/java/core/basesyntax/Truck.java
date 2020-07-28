package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck takes the remains of the barn to the landfill");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped working!");
    }
}
