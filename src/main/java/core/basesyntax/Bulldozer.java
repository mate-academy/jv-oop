package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer doWork");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopWork");
    }
}
