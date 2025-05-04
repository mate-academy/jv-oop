package core.basesyntax.machines;

public class Excavator extends Machine{
    @Override
    public void doWork() {
        System.out.println("Excavator digging a pit.");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stop digging - the cable of Nova Poshta broken.");
    }
}
