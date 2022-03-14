package core.basesyntax.model;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Beginning of work Bulldozer!");
    }

    @Override
    public void stopWork() {
        System.out.println("Stop work Bulldozer!");
    }
}
