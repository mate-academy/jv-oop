package core.basesyntax.models;

import core.basesyntax.machine.Machine;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator with serial number "
                + getSerialNumber() + " started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator with serial number "
                + getSerialNumber() + " stopped its work");
    }
}
