package core.basesyntax.machines;

import core.basesyntax.Machine;

public class Truck extends Machine {

    @Override
    public void doWork() {
        System.out.println("Truck engine starts work! Dr-dr-dr-dr-dr!");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck engine stops work!");
    }
}
