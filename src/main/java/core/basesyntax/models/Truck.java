package core.basesyntax.models;

import core.basesyntax.Machine;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck started its work");
    }

    @Override
    public void endWork() {
        System.out.println("Truck stopped its work");
    }
}
