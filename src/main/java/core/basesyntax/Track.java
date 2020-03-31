package core.basesyntax;

public class Track extends Machine {
    @Override
    void doWork() {
        System.out.println("Buldozer is working...");
    }

    @Override
    void stopWork() {
        System.out.println("Buldozer is not working...");
    }
}
