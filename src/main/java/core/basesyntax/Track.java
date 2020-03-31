package core.basesyntax;

public class Track extends Machine {
    @Override
    public void doWork() {
        System.out.println("track started working");
    }

    @Override
    public void stopWork() {
        System.out.println("track stopped");
    }
}
