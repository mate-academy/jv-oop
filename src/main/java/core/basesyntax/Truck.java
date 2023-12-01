package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Truck is working! Brrr..");
    }

    @Override
    public void stopWork() {
        System.out.println("Track is stop working!");
    }
}
