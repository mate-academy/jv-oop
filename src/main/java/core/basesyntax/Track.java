package core.basesyntax;

public class Track extends Machine {

    @Override
    public void doWork() {
        System.out.println("Track: work started");
    }

    @Override
    public void stopWork() {
        System.out.println("Track: work stopped");
    }
}
