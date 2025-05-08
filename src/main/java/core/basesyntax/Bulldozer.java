package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer began leveling the ground");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer has finished leveling the ground");
    }
}
