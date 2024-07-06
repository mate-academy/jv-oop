package core.basesyntax.model;

import core.basesyntax.Machine;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Common Truck, You can do it");
    }

    @Override
    public void stopWork() {
        System.out.println("Ohh Truck, try again");
    }
}
