package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer " + getName() + " start working!");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer " + getName() + " stop working!");
    }

}
