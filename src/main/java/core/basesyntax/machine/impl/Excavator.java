package core.basesyntax.machine.impl;

import core.basesyntax.machine.Machine;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator is working...");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator is stopping...");
    }
}
