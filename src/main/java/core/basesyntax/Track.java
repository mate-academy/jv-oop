package core.basesyntax;

public class Track extends Machine {
    @Override
    public void doWork() {
        System.out.println(this + " started working!");
    }

    @Override
    public void stopWork() {
        System.out.println(this + " stopped working!");
    }
}
