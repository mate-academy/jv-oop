package core.basesyntax.cars;

public class Track extends Machine {
    @Override
    public void doWork() {
        System.out.println("The cybertruck STARTED working!");
    }

    @Override
    public void stopWork() {
        System.out.println("The cybertruck STOP working!");
    }
}
