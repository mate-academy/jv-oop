package core.basesyntax;

public class Track extends Machine {
    @Override
    public void doWork() {
        System.out.println("Track does working");
    }

    @Override
    public void stopWork() {
        System.out.println("Track stops working");
    }
}
