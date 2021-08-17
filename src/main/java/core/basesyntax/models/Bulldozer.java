package core.basesyntax.models;

import core.basesyntax.machine.Machine;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer with serial number "
                + getSerialNumber() + " started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer with serial number "
                + getSerialNumber() + " stopped its work");
    }
}
