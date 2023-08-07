package core.basesyntax.machine;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer is doing its work!" + super.getStrength());
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer has stopped its work!" + super.getRelaxing());
    }
}
