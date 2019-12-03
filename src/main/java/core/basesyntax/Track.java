package core.basesyntax;

public class Track extends Machine {

    @Override
    public void doWork() {
        System.out.println("Track have started it's work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Track stopped it's work!");
    }
}
