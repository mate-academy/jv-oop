package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer started leveling the ground.");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped leveling the ground.");
    }
}
