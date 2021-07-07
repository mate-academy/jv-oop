package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer has just started to work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer has just stopped working.");
    }
}
