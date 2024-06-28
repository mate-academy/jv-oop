package core.basesyntax.machine.impl;

import core.basesyntax.machine.Machine;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer is working...");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer is stopping...");
    }
}
