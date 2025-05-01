package core.basesyntax.model;

import core.basesyntax.Machine;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator starts digging");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator has stopped digging");
    }
}
