package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator began to dig a hole in the ground.");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator finished digging the hole in the ground.");
    }
}
