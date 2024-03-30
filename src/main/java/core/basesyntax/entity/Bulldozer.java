package core.basesyntax.entity;

import core.basesyntax.Machine;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer started work");
    }

    @Override
    public void stopWork() {
        System.out.println("Bulldozer stopped word");
    }
}
