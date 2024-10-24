package core.basesyntax.machine;

import core.basesyntax.Machine;

public class Truck extends Machine {
    public void doWork() {
        System.out.println("This truck has started its work!");
    }

    public void stopWork() {
        System.out.println("This truck has stopped working!");
    }
}
