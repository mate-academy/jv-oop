package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator began digging a trench");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator has finished digging a trench");
    }
}
