package core.basesyntax.model.impl;

import core.basesyntax.model.Machine;

public class Excavator extends Machine {

    @Override
    public void doWork() {
        System.out.println("Excavator has started doing his work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator has stopped doing his work!");
    }
}
