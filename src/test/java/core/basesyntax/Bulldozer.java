package core.basesyntax;

import core.basesyntax.Machine;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("core.basesyntax.Bulldozer has started working.");
    }

    @Override
    public void stopWork() {
        System.out.println("core.basesyntax.Bulldozer has stopped working.");
    }
}
