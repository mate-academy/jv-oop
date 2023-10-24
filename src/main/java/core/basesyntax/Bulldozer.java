package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer started its work");
    }

    @Override
    public void doStopWork() {
        System.out.println("Bulldozer stopped its work.");
    }
}
