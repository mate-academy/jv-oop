package core.basesyntax;

public class Track extends Machine {

    @Override
    public void doWork() {
        System.out.println("Track has begun to work!!!");
    }

    @Override
    public void stopWork() {
        System.out.println("Track has stopped to work!!!");
    }
}
