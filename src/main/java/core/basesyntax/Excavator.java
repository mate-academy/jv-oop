package core.basesyntax;

public class Excavator extends Machine {

    public Excavator(String model) {
        super(model);
    }

    @Override
    public void doWork() {
        System.out.println("Excavator " + getModel() + "  started a work");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator  " + getModel() + " stopped a work");
    }
}
