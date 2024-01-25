package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer does work: trrr trrr tududum");
    }

    public void stopWork() {
        System.out.println("Bulldozer stops work");
    }
}
