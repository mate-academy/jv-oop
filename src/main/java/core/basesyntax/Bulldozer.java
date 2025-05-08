package core.basesyntax;

public class Bulldozer extends Machine {
    public void doWork() {
        System.out.println("Bulldozer started its engine and began to work.");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer turned off its engine and stopped working.");
    }
}
