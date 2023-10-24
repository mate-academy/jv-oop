package core.basesyntax.machines;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Start work Bulldozer");
    }

    @Override
    public void stopWork() {
        System.out.println("Stop work Bulldozer");
    }
}
