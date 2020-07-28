package core.basesyntax;

public class Track extends Machine {
    @Override
    public void doWork() {
        System.out.println("B-r-r-r-r, Track is on position!");
    }

    @Override
    public void stopWork() {
        System.out.println("Your money is wasting! Track has stopped working.");
    }
}
