package core.basesyntax.model.impl;

import core.basesyntax.model.Machine;

public class Bulldozer extends Machine {

    @Override
    public void doWork() {
        System.out.println("Bulldozer has started doing his work!");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer has stopped doing his work!");
    }
}
