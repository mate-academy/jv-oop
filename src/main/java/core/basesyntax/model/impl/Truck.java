package core.basesyntax.model.impl;

import core.basesyntax.model.Machine;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Truck has started doing his work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck has stopped doing his work!");
    }
}
