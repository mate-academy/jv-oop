package core.basesyntax;

public class Bulldozer extends Machine {
    public Bulldozer(String model, String fuel, int year, int countWheels) {
        super(model, fuel, year, countWheels);
    }

    @Override
    public void doWork() {
        System.out.println("This BULLDOZER " + getModel() + " started work");
    }

    @Override
    public void stopWork() {
        System.out.println("This BULLDOZER " + getModel() + " stopped work!");
    }
}
