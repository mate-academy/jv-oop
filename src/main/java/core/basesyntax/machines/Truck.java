package core.basesyntax.machines;

import core.basesyntax.service.Machine;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck starts to work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stops to work");
    }
}
