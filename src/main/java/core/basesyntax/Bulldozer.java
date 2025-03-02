package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("BulldozerDoWork");
    }

    @Override
    public void stopWork() {
        System.out.println("BulldozerStopWork");
    }
}
