package core.basesyntax;

public class Track extends Machine {
    @Override
    public void doWork() {
        System.out.println("Track doing work");
    }

    @Override
    public void stopWork() {
        System.out.println("Track stoped work");
    }
}
