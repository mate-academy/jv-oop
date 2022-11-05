package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Track: rrrr");
    }

    @Override
    public void stopWork() {
        System.out.println("Track stop");
    }
}
