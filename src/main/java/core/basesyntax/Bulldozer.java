package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    void doWork() {
        System.out.println("Bulldozer start working.");
    }

    @Override
    void stopWork() {
        System.out.println("Bulldozer finished work.");
    }
}
