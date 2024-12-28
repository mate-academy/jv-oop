package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    void doWork() {
        System.out.println("Bulldozer start work");

    }

    @Override
    void stopWork() {
        System.out.println("Bulldozer stop work");

    }
}
