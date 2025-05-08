package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer began flattening the ground.");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer has flattened the ground.");
    }
}
