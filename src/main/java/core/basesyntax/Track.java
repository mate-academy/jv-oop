package core.basesyntax;

public class Track extends Machine {
    @Override
    public void doWork() {
        System.out.println("Mister Track is back on track! He started working!");
    }

    @Override
    public void stopWork() {
        System.out.println("Mister Track stopped!");
    }
}
