package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("The engine started. The bulldozer started moving.");
    }

    @Override
    public void stopWork() {
        System.out.println("The engine was turned off. The truck stopped.");
    }
}
