package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer started its work.");
    }

    public void stopWork() {
        System.out.println("Bulldozer has stopped working.");
    }
}

