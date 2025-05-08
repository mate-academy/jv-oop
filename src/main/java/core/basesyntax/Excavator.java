package core.basesyntax;

public class Excavator extends Machine {
    public Excavator(String model, String fuel, int year, int countWheels) {
        super(model, fuel, year, countWheels);
    }

    @Override
    public void doWork() {
        System.out.println("This EXCAVATOR " + getModel() + " started work");
    }

    @Override
    public void stopWork() {
        System.out.println("This EXCAVATOR " + getModel() + " stopped work!");
    }
}
