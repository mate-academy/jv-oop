package core.basesyntax;

public class Track extends Machine {
    @Override
    void doWork() {
        System.out.println("Track is working...");
    }

    @Override
    void stopWork() {
        System.out.println("Track is not working...");
    }
}
