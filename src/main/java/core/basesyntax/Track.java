package core.basesyntax;

public class Track extends Machine {
    @Override
    public void doWork() {
        System.out.println("The track began to work.");
    }

    @Override
    public void stopWork() {
        System.out.println("The track stopped working.");
    }
}
