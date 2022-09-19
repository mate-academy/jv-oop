package core.basesyntax;

public class Bulldozer extends Machine {

    public Bulldozer(String model) {
        super(model);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer " + getModel() + " started a work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer " + getModel() + " stopped a work");
    }
}
