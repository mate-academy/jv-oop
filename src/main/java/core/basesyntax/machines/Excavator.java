package core.basesyntax.machines;

import core.basesyntax.service.Machine;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator starts to work");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stops to work");
    }
}
