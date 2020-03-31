package core.basesyntax;

public class Track extends Machine {
    public Track(String name) {
        super(name);
    }

    @Override
    public void doWork() {
        System.out.println(name + " work started");
    }

    @Override
    public void stopWork() {
        System.out.println(name + " work finished");
    }
}
