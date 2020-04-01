package core.basesyntax;

public class Track extends Machine {
    @Override
    public void doWork() {
        System.out.println("Track started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Track stopped its work");
    }
}
