package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Work was started by a bulldozer.");
    }

    @Override
    public void stopWork() {
        System.out.println("Work was stopped by a bulldozer.");
    }
}
