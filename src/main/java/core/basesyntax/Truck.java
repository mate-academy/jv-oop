package core.basesyntax;

public class Truck extends Machine {
    public Truck(String model, String fuel, int year, int countWheels) {
        super(model, fuel, year, countWheels);
    }

    @Override
    public void doWork() {
        System.out.println("This TRUCK " + getModel() + " started work");
    }

    @Override
    public void stopWork() {
        System.out.println("This TRUCK " + getModel() + " stopped work!");
    }
}
