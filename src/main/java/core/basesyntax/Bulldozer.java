package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozering");
    }

    @Override
    public void stopWork() {
        System.out.println("Stop bulldozering");
    }
}
