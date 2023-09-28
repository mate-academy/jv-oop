package core.basesyntax;

public class Excavator extends Machine {
    private boolean hasScoop;

    public Excavator(String model, String fuel, double engineCapacity, boolean hasScoop) {
        super(model, fuel, engineCapacity);
        this.hasScoop = hasScoop;
    }

    public boolean isHasScoop() {
        return hasScoop;
    }

    public void setScoop(boolean hasScoop) {
        this.hasScoop = hasScoop;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator is started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator is stopped its work");
    }
}
