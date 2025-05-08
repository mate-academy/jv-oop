package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Buldozer started working.");
    }

    @Override
    public void stopWork() {
        System.out.println("Buldozer stopped working.");
    }
}
