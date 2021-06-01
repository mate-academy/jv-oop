package core.basesyntax;

public class Bulldozer extends Machine {
    public Bulldozer(String model, String fuel, int year, int countWheels) {
        this.setModel(model);
        this.setFuel(fuel);
        this.setYear(year);
        this.setCountWheels(countWheels);
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
