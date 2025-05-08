package core.basesyntax.model;

import core.basesyntax.Machine;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer has started working");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer has stopped working");
    }
}
