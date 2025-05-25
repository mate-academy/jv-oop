package core.basesyntax;

public class Bulldozer extends Machine {

    @Override
    public void stopWork() {
        System.out.println("stopped work, Bulldozer");
    }

    @Override
    public void doWork() {
        System.out.println("started work, Bulldozer");
    }
}
