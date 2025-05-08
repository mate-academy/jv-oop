package core.basesyntax;

public class Track extends Machine {
    @Override
    public void doWork() {
        System.out.println("The track starts to work.");
    }

    @Override
    public void stopWork() {
        System.out.println("The track stops to work.");
    }
}
