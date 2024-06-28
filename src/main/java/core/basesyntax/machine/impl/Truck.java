package core.basesyntax.machine.impl;

import core.basesyntax.machine.Machine;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck is working...");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck is stopping...");
    }
}
