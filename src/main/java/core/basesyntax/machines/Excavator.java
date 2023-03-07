package core.basesyntax.machines;

import core.basesyntax.workflow.Machine;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("The excavator starts work");
    }

    @Override
    public void stopWork() {
        System.out.println("The excavator finished work");
    }
}
