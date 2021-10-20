package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("The bulldozer has just started it's work.");
    }

    @Override
    public void stopWork() {
        System.out.println("The bulldozer has just stopped it's work.");
    }
}
