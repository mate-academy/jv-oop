package core.basesyntax;

public class Track extends Machine {
    @Override
    public void doWork() {
        System.out.println("Track is doing its work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Track stopped doing its work!");
    }
}
