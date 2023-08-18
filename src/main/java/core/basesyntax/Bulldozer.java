package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    void stopWork() {
        System.out.println("Bulldozer stopped to work");
    }
}
