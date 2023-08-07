package core.basesyntax.machine;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator is doing its work!" + super.getStrength());
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator has stopped its work!" + super.getRelaxing());
    }
}
