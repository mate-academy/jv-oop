package core.basesyntax;

public class Bulldozer extends Machine {
    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("The bulldozer doing the work");
    }

    @Override
    public void stopWork() {
        System.out.println("The bulldozer stopped working");
    }
}
