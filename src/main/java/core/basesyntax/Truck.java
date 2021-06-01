package core.basesyntax;

public class Truck extends Machine {
    public Truck(String model, String fuel, int year, int countWheels) {
        model = getModel();
        fuel = getFuel();
        year = getYear();
        countWheels = getCountWheels();
    }

    @Override
    public void doWork() {
        System.out.println("This Truck started work");
    }

    @Override
    public void stopWork() {
        System.out.println("This Truck stopped work!");
    }
}
