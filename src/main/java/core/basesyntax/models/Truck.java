package core.basesyntax.models;

import core.basesyntax.machine.Machine;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck with serial number " + getSerialNumber() + " started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck with serial number " + getSerialNumber() + " stopped its work");
    }
}
