package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Machine bulldozer started its work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Machine bulldozer stopped working.");
    }
}
