package core.basesyntax.model;

public class Track extends Machine {
    @Override
    public void doWork() {
        System.out.println("Track start work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Track stop work!");
    }
}
