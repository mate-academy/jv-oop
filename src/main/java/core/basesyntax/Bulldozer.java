package core.basesyntax;

public class Bulldozer extends Machine{
    @Override
    public void doWork() {
        System.out.println("Bulldozer " + getName() + " machine started its work.");
    }

    @Override
    public void doStopWork() {
        System.out.println("Bulldozer " + getName() + " machine started its work.");
    }
}
