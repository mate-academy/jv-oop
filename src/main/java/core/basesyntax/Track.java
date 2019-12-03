package core.basesyntax;

public class Track extends Machine {

    public Track() {
        super();
    }

    @Override
    public void doWork() {
        System.out.println("Track начала свою работу");
    }

    @Override
    public void stopWork() {
        System.out.println("Track закончил свою работу");
    }
}
