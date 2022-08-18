package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println(" run Bulldozer ");
    }

    @Override
    public void stopWork() {
        System.out.println(" stop Bulldozer ");
    }
}
