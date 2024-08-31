package core.basesyntax.Model;

import core.basesyntax.Base.Machine;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck stopped working");
    }
}
