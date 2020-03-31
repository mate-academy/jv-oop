package core.basesyntax;

public class Track extends Machine {
    public Track() {
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }

    @Override
    public void stopWork() {
        System.out.println("Track finished working");
    }
}
