package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Started its work bulldozer");
    }

    @Override
    public void stopWork() {
        System.out.println("Completed its work bulldozer");
    }
}
