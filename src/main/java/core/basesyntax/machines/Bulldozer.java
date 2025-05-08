package core.basesyntax.machines;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println(("Bulldozer started doing its work"));
    }

    @Override
    public void stopWork() {
        System.out.println(("Bulldozer stopped doing its work"));
    }
}
