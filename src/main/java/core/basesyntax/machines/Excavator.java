package core.basesyntax.machines;

import core.basesyntax.Machine;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator engine starts work! Dr-dr-dr-dr-dr!");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator engine stops work!");
    }
}
