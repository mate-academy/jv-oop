package core.basesyntax.cars;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("The bulldozer STARTED working!");
    }

    @Override
    public void stopWork() {
        System.out.println("The bulldozer STOP working!");
    }
}
