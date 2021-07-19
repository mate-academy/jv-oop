package core.basesyntax;

public class Bulldozer extends Machine{
    @Override
    public void doWork() {
        System.out.println("Bulldozer " + model + " started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer "  + model + " stopped its work");
    }
}
