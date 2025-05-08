package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("bulldozer is starting to work");
    }

    @Override
    public void stopWork() {
        System.out.println("bulldozer is stopped");
    }
}
