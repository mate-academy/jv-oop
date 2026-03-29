package core.basesyntax.machines;

import core.basesyntax.Machine;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("do work");
    }

    @Override
    public void stopWork() {
        System.out.println("stop work");
    }
}
