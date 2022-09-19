package core.basesyntax;

public class Truck extends Machine {

    public Truck(String model) {
        super(model);
    }

    @Override
    public void doWork() {
        System.out.println("Truck " + getModel() + " started a work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck " + getModel() + " stopped a work");
    }
}
