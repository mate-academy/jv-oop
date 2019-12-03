package core.basesyntax;

public class Track extends Machine {

    @Override
    public void doWork() {
        System.out.println("Track start his work");
    }

    @Override
    public void stopWork() {
        System.out.println("Track end his work");
    }
}
