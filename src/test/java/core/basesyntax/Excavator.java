package core.basesyntax;

import core.basesyntax.Machine;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("core.basesyntax.Excavator has started working.");
    }

    @Override
    public void stopWork() {
        System.out.println("core.basesyntax.Excavator has stopped working.");
    }
}

