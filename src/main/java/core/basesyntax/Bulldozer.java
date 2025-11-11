package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer begins its job...");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer ends his job...");
    }
}
