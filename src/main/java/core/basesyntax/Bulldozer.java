package core.basesyntax;

public class Bulldozer extends Machine {
    public Bulldozer(String model, String fuel, int year, int countWheels) {
        model = getModel();
        fuel = getFuel();
        year = getYear();
        countWheels = getCountWheels();
    }

    @Override
    public void doWork() {
        System.out.println("This Bulldozer started work");
    }

    @Override
    public void stopWork() {
        System.out.println("This Bulldozer stopped work!");
    }
}
