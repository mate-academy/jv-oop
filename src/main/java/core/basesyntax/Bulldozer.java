package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer started!");
    }

    @Override
    public void stopedWorked() {
        System.out.println("Bulldozer stopped!");
    }
}
