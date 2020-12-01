package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.print("Bulldozer started its work.");
    }

    @Override
    public void stopWork() {
        System.out.print("Bulldozer stopped its work.");
    }
}
