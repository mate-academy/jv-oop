package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    void doWork() {
        System.out.println("Bulldozer is working...");
    }

    @Override
    void stopWork() {
        System.out.println("Buldozer is not working...");
    }
}
