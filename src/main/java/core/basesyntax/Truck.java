package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("The truck just started doing its work!");
    }

    @Override
    public void stopWork() {
        System.out.println("The truck has stopped working!");
    }
}
