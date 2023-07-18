package core.basesyntax.machines;

import core.basesyntax.service.Machine;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer starts to work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stops to work");
    }
}
