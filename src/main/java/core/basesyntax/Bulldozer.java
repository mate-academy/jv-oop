package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer started!");
    }

    @Override
    public void stopWorked() {
        System.out.println("Bulldozer stopped!");
    }
}
