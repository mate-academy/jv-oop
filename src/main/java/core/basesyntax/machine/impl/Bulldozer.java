package core.basesyntax.machine.impl;

import core.basesyntax.machine.Machine;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("The bulldozer started its work");
    }

    @Override
    public void stopWork() {
        System.out.println("The bulldozer stopped its work");
    }
}
