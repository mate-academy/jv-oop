package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    protected void doWork() {
        System.out.println("Bulldozer started working");
    }

    @Override
    protected void stopWork() {
        System.out.println("Bulldozer stopped working");
    }
}
