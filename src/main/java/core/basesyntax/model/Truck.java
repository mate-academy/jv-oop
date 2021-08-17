package core.basesyntax.model;

import core.basesyntax.model.Machine;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Truck started working");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped work");
    }
}
