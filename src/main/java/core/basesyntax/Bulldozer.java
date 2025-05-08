package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer started working");
    }

    @Override
    public void endWork() {
        System.out.println("Bulldozer stopped working");
    }
}
