package core.basesyntax.models;

public class Track extends Machine {
    @Override
    public void doWork() {
        System.out.println("Track is doing some work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Track stopped doing some work.");
    }
}
