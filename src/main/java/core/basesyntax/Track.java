package core.basesyntax;

public class Track extends Machine {
    @Override
    public void doWork() {
        System.out.println("Track has started to work");
    }

    @Override
    public void stopWork() {
        System.out.println("Track has stopped to work");

    }
}