package core.basesyntax;

public class Bulldozer extends Machine {

    public Bulldozer() {

    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped");
    }
}
