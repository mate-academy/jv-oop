package core.basesyntax.vehicles;

import core.basesyntax.Machine;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator activated, digging in progress!");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator halted, job done for now.");
    }
}
