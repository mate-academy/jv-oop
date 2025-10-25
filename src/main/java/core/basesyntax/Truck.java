package core.basesyntax;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Track starts wrrrr....");
    }

    @Override
    public void stopWork() {
        System.out.println("Track stops....");
    }
}
