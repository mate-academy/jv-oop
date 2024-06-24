package core.basesyntax.vehicles;

import core.basesyntax.Machine;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer machine has started operating.");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer machine has stopped operating.");
    }
}
