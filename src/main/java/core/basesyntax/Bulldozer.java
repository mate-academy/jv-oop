package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("doWork bulldozer");
    }

    @Override
    public void stopWork() {
        System.out.println("stopWork bulldozer");
    }
}
