package core.basesyntax;

public class Excavator extends Machine {
    public Excavator(String model, String fuel, int year, int countWheels) {
        model = getModel();
        fuel = getFuel();
        year = getYear();
        countWheels = getCountWheels();
    }

    @Override
    public void doWork() {
        System.out.println("This Excavator started work");
    }

    @Override
    public void stopWork() {
        System.out.println("This Excavator stopped work!");
    }
}
