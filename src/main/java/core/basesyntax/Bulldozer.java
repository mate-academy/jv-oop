package core.basesyntax;

public class Bulldozer extends Machine {
    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer start work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stop work!");
    }
}
